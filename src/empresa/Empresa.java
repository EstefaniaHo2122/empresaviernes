/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Scanner;

 /**
 *
 * @author Stefania
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.int);
        int opcion;
        do{
            System.out.println("Bienvenidos");
            System.out.println("******************");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Mostrar Empleado");
            System.out.println("3. Mostrar Empleado");
            System.out.println("4. Salir");
            System.out.println("");
            
            System.out.println("Digite una opcion: ");
            opcion=entrada.nextInt();
            
        }while(opcion!=4);
    }
    
}
