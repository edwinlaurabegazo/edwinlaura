/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author PC05-LAB02
 */
public class PersonaPrueba {
public static void main(String args[]){
//Creacion de un objeto
Persona p1 = new Persona();
//LLamando a un metodo del objeto creado

//Modificar valores
p1. nombre = "Juan";
p1. ap = "Esparza";
p1. am = "Lara";
p1. carrera = "Computo";
p1. dni = 77924877;
p1.habilitado="Si";
//Volvemos a llamar al metodo
System. out.println("\nNuevos valores del objeto Persona");
p1.desplegarnombre();
    float n1=5;
    float n2=9;
    float n3=10;
    
//Creacion de un objeto
Persona a = new Persona();
//LLamando a un metodo del objeto creado
float r = a.calcular(n1,n2,n3);
System.out.println("Su promedio es: "+r);
//Modificar valores

//Volvemos a llamar al metodo

}
}
