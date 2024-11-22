//Crie um programa que continue solicitando ao usuário que digite um número até que ele informe um valor positivo.
//Utilize o laço while para garantir que o número informado seja maior que 0. Mostre a mensagem "Número válido!" quando um número positivo for informado.
import java.util.Scanner;
import java.io.IOException;

public class WhileMedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número que será verificado: ");
        int n = scan.nextInt();
        while(n <= 0) {
            System.out.print("Não positivo... vai tentando aew!");
            n = scan.nextInt();
            if(n > 0) {
                System.out.println("Número válido!");
            }
        }

        scan.close();
    }
}
