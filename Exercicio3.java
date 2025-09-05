/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joeyroger;

/**
 *
 * @author IFSP
 */

import java.util.Scanner;
public class Exercicio3 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            
            long ftorial = 1;
            
            System.out.print(numero + "! = ");
            for (int i = numero; i >= 1; i--) {
                ftorial *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                }
            }
            
            System.out.println(" = " + ftorial);
        }
    }

}
    
    
