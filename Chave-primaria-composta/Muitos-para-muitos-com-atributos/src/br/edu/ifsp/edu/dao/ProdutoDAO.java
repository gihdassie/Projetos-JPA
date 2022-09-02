
package br.edu.ifsp.edu.dao;

import br.edu.ifsp.pep.modelo.Produto;
import java.util.List;
import javax.persistence.TypedQuery;

public class ProdutoDAO extends AbstractDAO1<Produto>{
    //Retornando o resultado da consulta em uma lista de Produtos
    public List<Produto> obterTodos(){
        TypedQuery<Produto>query = super.getEntityManager().createQuery("SELECT p FROM Produto p",Produto.class);
        return query.getResultList();
    }
}
