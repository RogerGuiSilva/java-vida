/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double soma = 0;
            int qtd = 0;
            char resp;
            
            do {
                System.out.print("Digite a nota do aluno: ");
                double nota = sc.nextDouble();
                soma += nota;
                qtd++;
                
                System.out.print("Deseja inserir nova nota? [S/N]: ");
                resp = sc.next().charAt(0); // pega o primeiro caractere
                
                // se o usuário digitar minúsculo, também funciona
                if (resp == 's') {
                    resp = 'S';
                } else if (resp == 'n') {
                    resp = 'N';
                }
                
            } while (resp == 'S');
            
            if (qtd > 0) {
                double media = soma / qtd;
                System.out.println("Media da turma: " + media);
            } else {
                System.out.println("Nenhuma nota inserida.");
            }
        }
    }
}


