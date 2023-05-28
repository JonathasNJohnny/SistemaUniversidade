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
public class Professor extends Pessoa{
    String cargo;
    String diaAula;
    Scanner input = new Scanner(System.in);

    public Professor(String cargo, String diaAula, String nome, String id, String email, int idade) {
        super(nome, id, email,idade);
        this.cargo = cargo;
        this.diaAula = diaAula;
        
    }
    
    
    
    ArrayList<Cadeiras> cadeiras = new ArrayList<Cadeiras>();

    public ArrayList<Cadeiras> getCadeira() {
        return cadeiras;
    }

    
    
    public void cadastrarNotasAluno(Aluno aluno, Cadeiras cadeira){
        if(aluno.cadeiras.isEmpty()){
            System.out.println("Não é possível cadastrar nenhuma nota. Não há cadeiras neste aluno");
        }
        else{
            System.out.println("Cadeiras cadastradas de " + aluno.nome);
            for (int i = 0; i < aluno.cadeiras.size(); i++) {
                System.out.println((i + 1) + "-" + cadeiras.get(i));
                
                	
            int posicaoCadeira = 0;   
            System.out.println("Insira a posição para adição de nota: ");
            posicaoCadeira = input.nextInt();  
            System.out.println("Adicionar nota na cadeira: "+cadeira.nomeCadeira);
            int notaAluno =0;
            notaAluno = input.nextInt();
            aluno.notas.add(new Notas(posicaoCadeira, notaAluno));
                
            }
        
        
    }

}
    
}
