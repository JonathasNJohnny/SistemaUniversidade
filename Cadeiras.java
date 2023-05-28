/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author Miguel
 */
public class Cadeiras {
    
    String nomeCadeira;
    int cargaHorária;
    String dia;
    int data;

    public Cadeiras(String nome, int cargaHorária, String dia, int data) {
        this.nomeCadeira = nome;
        this.cargaHorária = cargaHorária;
        this.dia = dia;
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nCadeira:" + nomeCadeira + "\nCarga horária:" + cargaHorária + "\ndia:" + dia + "\ndata:" + data + "\n";
    }
    

    
    
    
}
