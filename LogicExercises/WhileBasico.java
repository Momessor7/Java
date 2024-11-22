//Utilize um laço while para imprimir uma contagem regressiva de 10 até 1, cada número em uma linha. Não utilize variáveis fora do laço para controlar a contagem.
import java.util.Scanner;

public class WhileBasico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        scan.close();
    }
}
