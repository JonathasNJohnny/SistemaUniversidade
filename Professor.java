/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Professor extends Pessoa{
    String cargo;
    
    public Professor(String nome, String id, String email, int idade,String cargo) {
        super(nome, id, email, idade);
        this.cargo = cargo;
    }
    
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    
    
}
