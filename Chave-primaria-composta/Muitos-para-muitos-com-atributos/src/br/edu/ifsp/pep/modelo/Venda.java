
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "venda")
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @OneToMany(mappedBy = "venda",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Itens>itens;

    public Venda() {
    }

    public Venda(int id, Date data, List<Itens> itens) {
        this.id = id;
        this.data = data;
        this.itens = itens;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
    
    
            
}
