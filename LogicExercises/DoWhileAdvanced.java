//Crie um menu simples com 3 opções. As opções devem ser:
//Exibir "Opção 1"
//Exibir "Opção 2"
//Sair
//O programa deve apresentar esse menu e aguardar o usuário escolher uma opção.
//Caso o usuário escolha a opção 1 ou 2, mostre uma mensagem correspondente. Caso o usuário escolha a opção 3, o programa deve encerrar.
//Utilize o laço do-while para manter o menu exibido até que o usuário escolha a opção 3.

import java.util.Scanner;
import java.io.IOException;

public class DoWhileAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;

        do {
            opcao = MENU();
            if(opcao == 1) {
                System.out.println("Você escolheu a opção 1.");
            } else if(opcao == 2) {
                System.out.println("Você escolheu a opção 2.");
            } else if(opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida, coloque um número dentre as opções sugeridas.");
            }
        } while(opcao != 3);

        scan.close();
    }

    public static int MENU() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("Opção 1");
        System.out.println("Opção 2");
        System.out.println("3- Sair");
        System.out.print("Insira: ");

        int opcao = scan.nextInt();
        return opcao;
    }
}
