package ir.hospitalapp.model.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA {
    private static JPA jpa = new JPA();
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("hospital");

    private JPA() {
    }

    public static JPA getJpa() {
        return jpa;
    }

    public EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
