
import java.util.Scanner;

public class Atividade2 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite o valor : ");
        double vlr = sc.nextDouble();
        
        System.out.print("Digite os juros (%): ");
        double tx = sc.nextDouble();
        
        System.out.print("Digite a quantidade dos meses: ");
        int meses = sc.nextInt();
        
        
        double taxaDecimal = tx / 100;
        
        for (int i = 1; i <= meses; i++) {
            vlr = vlr + (vlr * taxaDecimal);
            System.out.printf("Mês %d: %.2f%n", i, vlr);
        }   }
}
}
        
        
       
    
    


