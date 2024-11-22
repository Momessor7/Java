//Solicite ao usuário um número inteiro N e, utilizando um laço for, calcule a soma de todos os números inteiros de 1 até N (inclusive). Imprima o valor da soma ao final.
import java.util.Scanner;

public class ForMedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número desejado para ser equivalente a n: ");
        int n = scan.nextInt();
        int soma = 0; //inicializar a soma em 0 para somar os 'i' até n
        for(int i = 1; i <= n; i++) {
            soma +=  i;
        }
        System.out.printf("Valor da soma total é de: %d\n", soma);

        scan.close();
    }
}
