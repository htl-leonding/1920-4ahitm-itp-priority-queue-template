package at.htl.priority.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * https://www.boraji.com/hibernate-5-jpa-2-configuration-example
 */
public class JpaUtil {
    private static final String PERSISTENCE_UNIT_NAME = "myPU";
    private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}
