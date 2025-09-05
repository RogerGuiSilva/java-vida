/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entra com nome e 3 notas inteiras (0 a 10)
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Nota da 1a prova: ");
        int n1 = sc.nextInt();

        System.out.print("Nota da 2a prova: ");
        int n2 = sc.nextInt();

        System.out.print("Nota do trabalho: ");
        int nt = sc.nextInt();

        // pesos: prova1=4, prova2=4, trabalho=2 (total 10)
        double media = (n1 * 4 + n2 * 4 + nt * 2) / 10.0;

        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);

        sc.close();
    }
}