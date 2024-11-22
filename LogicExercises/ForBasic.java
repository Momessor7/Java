//Crie um programa que utilize um laço for para imprimir os números de 1 a 10, cada um em uma linha. Não use variáveis fora do laço para fazer a contagem.
import java.util.Scanner;

public class ForBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {
            System.out.println("O número atual é: " + i + ".");
        }

        scan.close();
    }
}
