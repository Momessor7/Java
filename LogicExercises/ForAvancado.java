//Crie um programa que receba um número inteiro e verifique se ele é primo ou não. 
//Um número é considerado primo se ele for maior que 1 e não for divisível por nenhum número que não seja ele mesmo e 1. Utilize um laço for para fazer as verificações.
import java.util.Scanner;

public class ForAvancado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o valor n: ");
        int n = scan.nextInt();
        boolean primo = true; //começa considerando que seja um número primo

        for(int i = 2; i <= n / 2; i++) { //i começa em 2 pois pula 0 e 1
            if(n % i == 0) { //se o n inserido dividido por 2, 3, 4... for = 0, quer dizer que não é um número primo
                primo = false; //então já não é mais considerado primo
                break;
            }
        }

        if(primo && n > 1) { //se primo for true ainda e o n for maior que 1
            System.out.println( n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }

        scan.close();
    }
}
