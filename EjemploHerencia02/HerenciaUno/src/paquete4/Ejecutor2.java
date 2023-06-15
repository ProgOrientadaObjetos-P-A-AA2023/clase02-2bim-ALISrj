/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        
        String nombre = "Lex";
        String apellido = "Ramirez";
        String identificacion = "115611";
        int edad = 18;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerCostoCredito(300);
        estPresencial.establecerNumeroCreditos(5);
        estPresencial.calcularMatriculaPresencial();
        System.out.println(estPresencial);
    }
}
