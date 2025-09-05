/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joeyroger;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println(c + " C = " + f + " F");

        sc.close();
    }
}

