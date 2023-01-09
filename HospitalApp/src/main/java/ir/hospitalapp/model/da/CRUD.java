package ir.hospitalapp.model.da;

import ir.hospitalapp.model.utils.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class CRUD<T> implements AutoCloseable {
    private EntityManager entityManager;

    public CRUD() {
    }

    public T add(T t) throws Exception {
        entityManager = JPA.getJpa().getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(t);
        entityTransaction.commit();
        return t;
    }

    public T edit(T t) throws Exception {
        entityManager = JPA.getJpa().getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityTransaction.commit();
        entityManager.merge(t);
        return t;
    }

    public T remove(Class tClass, long id) throws Exception {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        T t = (T) entityManager.find(tClass, id);
        entityManager.remove(t);
        entityTransaction.commit();
        return t;
    }

    public List<T> findAll(String entityName) throws Exception {
        List<T> tList = (List<T>) entityManager.createQuery("Select oo from " + entityName+ " oo");
        return tList;
    }

    public T findById(Class tClass, long id) throws Exception {
        T t = (T) entityManager.find(tClass, id);
        return t;
    }

    @Override
    public void close() throws Exception {
//        entityManager.close();
    }
}
