package EXStreino;

//Solicite ao usuário que informe um número inteiro. Em seguida, use um laço for para imprimir a tabuada desse número (de 1 a 10).
import java.util.Scanner;
import java.io.IOException;

public class ForBasic2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Forneça um nº inteiro: ");
        int n = scan.nextInt();
        for(int i = 0; i <= 10; i++) {
            int tabuada = n * i;
            System.out.println("A multiplicação do nº escolhido por " + i + " é de: " + tabuada);
        }

        scan.close();
    }
}
