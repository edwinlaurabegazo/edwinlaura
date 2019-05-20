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
public class Persona {
String nombre;
    String ap;
    String am;
    String carrera;
    int dni;
    String habilitado;
     void desplegarnombre()
    {
       System.out.println("Nombre : "+nombre);
       System.out.println("apellido paterno : "+ap);
       System.out.println("apellido materno : "+am);
       System.out.println("carrera : "+carrera);
       System.out.println("dni : "+dni);
       System.out.println("Habilitado : "+habilitado);
    }  

     public float calcular(float a,float b,float c)
        {
        float prom;
        prom=(a+b+c)/3;
        return prom;
        }    
}

 


