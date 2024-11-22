//Peça ao usuário para digitar um número inteiro e, utilizando um laço while, calcule o fatorial deste número.
//Lembre-se que o fatorial de um número n é o produto de todos os inteiros de 1 até n (ou seja, n! = n * (n-1) * ... * 1). Exiba o resultado ao final.
import java.util.Scanner;

public class WhileAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número inteiro que será feito o fatorial do mesmo: ");
        int n = scan.nextInt();
        int fatorial = 1;

        while(n > 1) {
            fatorial = fatorial * n;
            n--;
        }

        System.out.println("O fatorial do número escolhido é de: " + fatorial);

        scan.close();
    }
}
