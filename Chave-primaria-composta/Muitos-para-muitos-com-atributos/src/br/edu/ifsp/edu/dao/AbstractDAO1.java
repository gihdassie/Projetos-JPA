package br.edu.ifsp.edu.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO1<T> {

    private EntityManagerFactory emf;

    public AbstractDAO1() {
        emf = Persistence.createEntityManagerFactory("Aula2PU");
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
}
