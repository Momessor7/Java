package EXStreino;

//Solicite ao usuário dois números inteiros: A e B, onde A < B. Em seguida, utilize um laço for para contar quantos números ímpares existem entre A e B (inclusive).
import java.util.Scanner;
import java.io.IOException;

public class ForMedio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int troca;
        if(a > b) { //garantir que a seja menor que b
            troca = b;
            b = a;
            a = troca;
        }

        int cont = 0;
        for(int i = a; i < b; i++) {
            if(i % 2 != 0) {
                cont++;
            }
        }
        System.out.println("Existem " + cont + " nºs ímpares entre " + a + " e " + b);

        scan.close();
    }
}
