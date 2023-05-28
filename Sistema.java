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

    public void cadastrarCadeirasSistema(Cadeiras cadeira) {
        cadeiras.add(cadeira);
    }

    public void removerCadeiraSistema() {
        int posicaoCadeira = 0;

        if (cadeiras.isEmpty()) {
            System.out.println("Nenhuma cadeira cadastrada no sistema");
        } else {
            listarCadeiras();
            System.out.println("Insira a posição para remoção da cadeira: ");
            posicaoCadeira = input.nextInt();

            while (posicaoCadeira > cadeiras.size() || posicaoCadeira <= 0) {
                System.out.println("Valor inválido! Apenas números entre 1 e " + cadeiras.size());
                System.out.println("Insira a posição para remoção da cadeira: ");
                posicaoCadeira = input.nextInt();

            }
            cadeiras.remove(posicaoCadeira - 1);
            System.out.println("Remoção bem sucedida");

        }

    }

    public void listarCadeiras() {
        if (cadeiras.isEmpty()) {
            System.out.println("Nenhuma cadeira adicionada");
        } else {
            for (int i = 0; i < cadeiras.size(); i++) {
                System.out.println((i + 1) + ":" + cadeiras.get(i).toString());
            }
        }
    }

    public void listarCadeirasAluno(Aluno aluno) {
        if (aluno.cadeiras.isEmpty()) {
            System.out.println("Nenhuma cadeira cadastrada");
        } else {
            System.out.println("Cadeiras cadastradas de " + aluno.nome);
            for (int i = 0; i < aluno.cadeiras.size(); i++) {
                System.out.println((i + 1) + "-" + cadeiras.get(i));
            }
        }
    }

    public void cadastrarCadeiraAluno(Aluno aluno, Cadeiras cadeira) {
        if (aluno.cadeiras.size() >= 9) {
            System.out.println("Limite máximo de cadeiras cadastradas atingido.");
            System.out.println("Não foi possível adicionar mais nenhuma cadeira.");
        } else {
            aluno.cadeiras.add(cadeira);
        }
    }

    public void cadastrarCadeiraProfessor(Professor professor, Cadeiras cadeira) {
        for (int i = 0; i < professor.getCadeira().size(); i++) {
            if (professor.diaAula.equals(cadeira.dia)) {
                professor.getCadeira().add(cadeira);
            }

        }
    }
    
    
}