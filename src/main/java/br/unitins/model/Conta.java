package br.unitins.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;


@Entity
public class Conta extends PanacheEntity {
    private String nomeDono;
    private String saldo;
    private String numeroConta;
    
    
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public String getSaldo() {
        return saldo;
    }
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    
}
