//Crie um programa que defina uma matriz 2x2 e a preencha com os seguintes valores:
//[1, 2]
//[3, 4]
//Em seguida, utilize um laço para imprimir todos os valores da matriz no formato de uma tabela, com uma linha para cada linha da matriz.
import java.util.Scanner;

public class MatrizBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        
        //preencher a matriz
        matriz[0][0] = 1;
        //matriz[1][0] = 2; //observe que nesse caso ficou 1 3 e na outra linha 2 4(ordem de 0 e 1 importa)
        //matriz[0][1] = 3;
        matriz[0][1] = 2; //desse jeito fica na ordem correta
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        for(int i = 0; i < 2; i++) { //vai percorrer o tanto que foi colocado na matriz la em cima(Ln 11)
            for(int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " "); //imprimindo a primeiro linha com os 2 valores
            }
            System.out.println(); //pulando linha
        }

        scan.close();
    }
}