
import java.util.Scanner;
public class atividade3 {    
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
