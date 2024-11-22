//Crie um programa que utilize um laço do-while para imprimir os números de 1 a 5, um por um. O laço deve ser executado ao menos uma vez antes de verificar a condição.
import java.util.Scanner;

public class DoWhileBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 1;
        do {
            System.out.println(n);
            n += 1;
        } while(n <= 5);

        scan.close();
    }
}
