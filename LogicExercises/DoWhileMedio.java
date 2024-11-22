//Solicite ao usuário que digite um número. Se o número for ímpar, continue pedindo que ele digite outro número, até que ele digite um número par.
//Use o laço do-while para garantir que o programa continue pedindo até que um número par seja informado.
import java.util.Scanner;
import java.io.IOException;

public class DoWhileMedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int n = scan.nextInt();
        do {
            System.out.print("Digite outro número: ");
            n = scan.nextInt();
        } while(n % 2 != 0);

        scan.close();
    }
}
