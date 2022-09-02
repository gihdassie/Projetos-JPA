/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.edu.dao;

import br.edu.ifsp.pep.modelo.Itens;
import br.edu.ifsp.pep.modelo.Venda;
import javax.persistence.EntityManager;

/**
 *
 * @author aluno
 */
public class VendaDAO extends AbstractDAO1<Venda>{
// uma forma de inserir
//    @Override
//    public void inserir(Venda venda) {
//        
//        EntityManager em = getEntityManager();
//
//        em.getTransaction().begin();
//        em.persist(venda);
//        
//        for(Itens item :venda.getItens()){
//            em.persist(item);
//        }
//        em.getTransaction().commit();
//        
//        em.close();
//    }
    
}
