package Data;

import EmergencySystem.ConfigureASystem;
import EmergencySystem.EmergencySystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 *  @author shrutisen
 */
public class DataUtil {

    private static final String FILENAME = "/Users/sanskruti/Desktop/aed-final/DataBank.db4o"; //  // path to the data store
    private static DataUtil dB4OUtil;
    
    public synchronized static DataUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DataUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EmergencySystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EmergencySystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public EmergencySystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EmergencySystem> systems = conn.query(EmergencySystem.class); // Change to the object you want to save
        EmergencySystem system;
        if (systems.size() == 0){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
