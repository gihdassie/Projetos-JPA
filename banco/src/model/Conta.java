
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="conta")
public abstract class Conta implements Serializable{
    @Id    
    @Column(name="numeroAgencia",nullable = false)
    private long numeroAgencia;
    
    @Id
    @Column(name="numeroConta",nullable = false)
    private long numeroConta;
    
    @Column(name="salario",precision = 20,scale=2, nullable = false)
    private BigDecimal saldo;


    public long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    
}
