/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludar.usuario;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class SaludarUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba su nombre");
        String a;
        Scanner n = new Scanner (System.in);
        a = n.next();
        System.out.println("Hola "+ a);
        // TODO code application logic here
    }
    
}
