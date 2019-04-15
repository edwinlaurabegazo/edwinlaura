/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author PC05-LAB02
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*en el switch solo se puede evaluar las siguientes varialbes, falso es 0 
         byte, short, int, char o string
        sintaxis
        switch(expresion)
        {
        caso valor1: case valorx:
        sentencia1 el codigo de aca termina en ;
        break; >con esto termina el case
        caso valor2:
        sentencia2
        break;
        vaso valor n...
        sentencia
        break;
        default: si no se cumple con ninguna de las opciones entra a default, es opcional ponerlo
        sentencia
        }*/
         int mes = 1;
       // String mesString;
        // instrucción switch con tipo de datos int
        switch (mes) 
        {
            case 1:
            case 12:
            case 2: //mesString = "Invierno";
                System.out.println("Invierno");
            break;             
            case 3:  
            case 4:  
            case 5:  //mesString = "primavera";
                System.out.println("primavera");
                     break;
            case 6:  
            case 7:  
            case 8:  //mesString = "verano";
                System.out.println("verano");
                     break;
            case 9:  
            case 10:  
            case 11:  //mesString = "otoño";
                System.out.println("otoño");
                     break;                 
            default: //mesString = "Mes inválido";
                System.out.println("Mes invalido");
                     break;
        }
        //System.out.println(mesString);
    }
    
}
