/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        // Trabajo clases 16 junio 2022
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
        int i = 0;

        System.out.println("Bienvenido.\n");
        while (bandera) {

            System.out.printf("Ingrese el estudiante nro %d\n", i + 1);
            System.out.print("Ingrese nombre.\n> ");
            String n = entrada.nextLine();
            System.out.print("Ingrese apellido.\n> ");
            String ap = entrada.nextLine();
            System.out.print("Ingrese identificación.\n> ");
            String ced = entrada.nextLine();
            System.out.print("Ingrese edad.\n> ");
            int edad = entrada.nextInt();
            System.out.print("Ingrese número de créditos.\n> ");
            int creditos = entrada.nextInt();
            System.out.print("Ingrese costo de créditos.\n> ");
            double costo = entrada.nextInt();
            entrada.nextLine();

            EstudiantePresencial estudiante = new EstudiantePresencial(n,
                    ap, ced, edad, costo, creditos);
            estudiante.calcularMatriculaPresencial();

            cadena = String.format("%sEstudiante nro %d\n%s\n", cadena,
                     i + 1,
                    estudiante);

            System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            if (opcion.equals("S")) {
                bandera = false;
            }
            i++;
        }

        System.out.printf("%s\n", cadena);

    }
}
