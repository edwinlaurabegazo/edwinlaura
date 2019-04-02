/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author EdwinLBegazo
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String nombre="EDWIN ";
        String ap="LAURA";
        String nueva_linea="\n";
        String tabulador="\t";
        String retroceso="\b";//borra un caracter a la izquierda donde se inserta el codigo
        String retorno_de_carro="\r";//borra todo lo que esta a la izquierda donde se inserta el comando
        String comilla_simple="\'";
        String comilla_doble="\"";        
        System.out.println("Nueva Linea: "+nueva_linea+nombre+ap);
        System.out.println("Comilla simple: "+nueva_linea+comilla_simple+nombre+ap+comilla_simple);
        System.out.println("Comilla doble: "+nueva_linea+comilla_doble+nombre+ap+comilla_doble);
    }
    
}
