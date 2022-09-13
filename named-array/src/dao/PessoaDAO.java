package dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Pessoa;

public class PessoaDAO extends AbstractDAO<Pessoa>{
    
    public Pessoa buscarPorId(long id){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorId", Pessoa.class);
        
        query.setParameter("id", id);
        
        return query.getSingleResult();
    }
    
    public List<Pessoa> buscarPorNome(String nome){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorNome", Pessoa.class);
        
        query.setParameter("nome", "%" + nome + "%");
        
        return query.getResultList();
    }
    
    public List<Pessoa> buscarPorSalario(BigDecimal salario){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorSalario", Pessoa.class);
        
        query.setParameter("salario", salario);
        
        return query.getResultList();
    }
    
    public List<Pessoa> buscarPorData(Date dataNascimento){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorData", Pessoa.class);
        
        query.setParameter("dataNascimento", dataNascimento);
        
        return query.getResultList();
    }
    
    public void remover(Pessoa p){
       EntityManager em =  getEntityManager();
       em.getTransaction().begin();
       System.out.println("Esta no estado gerenciado? " + em.contains(p));
       
       //Pessoa merge = em.merge(p);
       Pessoa merge = em.find(Pessoa.class, p.getId());
       System.out.println("Esta no estado gerenciado? " + em.contains(p));
       
       em.remove(merge);   // Espera-se que ocorra um erro.
       
       em.getTransaction().commit();
       em.close();
    }
    
    
    public void verficarEstadoDoCicloDeVIda(){
        Pessoa p = new Pessoa("Ana", new Date(), new BigDecimal(5000));
        
        EntityManager em = getEntityManager();
        
        //Verifica se o objeto esta no estado gerenciado(managed)
        System.out.println("Esta no estado gerenciado? " + em.contains(p));
        
        //Executa o metodo persist do entity manager
        //o objeto deve ir para o estado gerenciado
        em.persist(p);
        
        em.close();
        
         //Verifica se o objeto esta no estado gerenciado(managed)
        System.out.println("Esta no estado gerenciado? " + em.contains(p));
        
        //Remove o objeto p do estado gerenciado
        em.detach(p);
        //Verifica se o objeto esta no estado gerenciado(managed)
        System.out.println("Esta no estado gerenciado? " + em.contains(p));
    }
}
