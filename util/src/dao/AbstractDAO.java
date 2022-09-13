package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO<T> {

    private EntityManagerFactory emf;

    public AbstractDAO() {
        emf = Persistence.createEntityManagerFactory("named-arrayPU");
    }

    protected EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void inserir(T entity) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    public void alterar(T entity) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }
    
    public void remover(T entity){
        
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        em.remove(em.merge(entity));
        em.getTransaction().commit();
        
        em.close();
    }
}
