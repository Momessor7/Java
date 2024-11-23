package EXStreino;

//Crie um programa que, dado um número N, imprima uma pirâmide numérica de altura N.
//Cada linha da pirâmide deve conter números crescentes até o número da linha, seguido por números decrescentes. Utilize apenas laços for para implementar.
import java.util.Scanner;
import java.io.IOException;

public class ForAdvanced2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número N: ");
        int N = scan.nextInt();
        
        // Imprimindo a pirâmide
        for (int i = 1; i <= N; i++) {
            // Imprime os espaços à esquerda
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // Imprime os números crescentes
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Imprime os números decrescentes
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Nova linha
            System.out.println();
        }

        scan.close();
    }
}
