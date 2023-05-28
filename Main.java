/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Sistema sistema = new Sistema();
        
        Aluno aluno1 = new Aluno("Davi","12","a",12);
        
        Cadeiras calculo1 = new Cadeiras("Calculo",60,"quarta",12);
        Cadeiras algebra = new Cadeiras("Algebra",60,"segunda",12);
        Cadeiras calculo2 = new Cadeiras("Calculo",60,"quinta",12);
        Cadeiras algebraLinear = new Cadeiras("Algebra Linear",60,"sexta",12);
        Cadeiras fisica = new Cadeiras("Fisica",60,"segunda",12);
        
        Professor professor1 = new Professor("Algebra Linear","Quarta-Feira","Marcos","00001","marcos@aluno.UniDavi.com",34);
     
        
        sistema.cadastrarCadeirasSistema(calculo1);
        sistema.cadastrarCadeirasSistema(algebra);
        sistema.cadastrarCadeirasSistema(calculo2);
        sistema.cadastrarCadeirasSistema(algebraLinear);
        
        
        sistema.cadastrarCadeiraAluno(aluno1, calculo1);
        sistema.cadastrarCadeiraAluno(aluno1, algebra);
        sistema.cadastrarCadeiraAluno(aluno1, calculo2);
        sistema.cadastrarCadeiraAluno(aluno1, algebraLinear);
        sistema.cadastrarCadeiraAluno(aluno1, fisica);
        
       
        //sistema.cadastrarCadeiraProfessor(professor, algebra);
        
        
        
        //System.out.println("\n");
        sistema.listarCadeiras();
        sistema.removerCadeiraSistema();
        sistema.listarCadeiras();
        
    }
    
}
