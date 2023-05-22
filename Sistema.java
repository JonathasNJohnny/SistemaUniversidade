/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Sistema {
    
    Scanner input = new Scanner(System.in);
    ArrayList<Cadeiras> cadeiras = new ArrayList<Cadeiras>();
    
    public void cadastrarCadeirasSistema(Cadeiras cadeira){
        cadeiras.add(cadeira);
    }
    
    public void removerCadeiraSistema(){
        int posicaoCadeira = 0;
        if(cadeiras.isEmpty()){
            System.out.println("Nenhuma cadeira cadastrada no sistema");
        }
        else{
            listarCadeiras();
            System.out.println("Insira a posição para remoção da cadeira");
            posicaoCadeira = input.nextInt();
            cadeiras.remove(posicaoCadeira);
        }
 
    }
        
    
    public void listarCadeiras(){
        if(cadeiras.isEmpty()){
            System.out.println("Nenhuma cadeira adicionada");
        }
        else{
            for(int i = 0; i < cadeiras.size(); i++){
                System.out.println(cadeiras.get(i));
            }
        }
    }
    
    
    public void listarCadeirasAluno(Aluno aluno){
        if(aluno.cadeiras.isEmpty()){
            System.out.println("Nenhuma cadeira cadastrada");
        }
        else{
            for(int i = 0; i < aluno.cadeiras.size(); i++){
                System.out.println(cadeiras.get(i));
            }
        }
    }
    
    public void cadastrarCadeiraAluno(Professor professor, Aluno aluno){
        if(aluno.cadeiras.size() >= 9){
            System.out.println("Limite máximo de cadeiras cadastradas atingido");
        }
        else{
            
        }
    }
    
    public void cadastrarCadeiraProfessor(Professor professor, Cadeiras cadeira){
        for(int i = 0; i < professor.getCadeira().size(); i++){
            if(professor.diaAula.equals(cadeira.dia)){
                professor.getCadeira().add(cadeira);
            }
                  
            
        }
    }
}
