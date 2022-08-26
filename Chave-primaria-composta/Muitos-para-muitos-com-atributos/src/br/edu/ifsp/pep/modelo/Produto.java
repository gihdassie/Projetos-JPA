/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

/**
 *
 * @author aluno
 */
@OneToMany
public class Produto {
    private int id;
    
    private String descricao;
    
    private double valor;
    
    private int quantidade;
}
