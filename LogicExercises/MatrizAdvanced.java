//Dada a matriz 3x3:
//[1, 2, 3]
//[4, 5, 6]
//[7, 8, 9]
//Crie um programa que realize a transposição dessa matriz (ou seja, troque suas linhas pelas colunas). Exiba a matriz original e a matriz transposta após a troca.
import java.util.Scanner;
import java.io.IOException;

public class MatrizAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Primeira matriz:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " "); //faz o primeiro elemento, espaço, segundo elemento, espaço
            }
            System.out.println();
        }


        int[][] transposta = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                transposta[j][i] = matriz[i][j]; //troca os valores da matriz comum(linhas pelas colunas)
            }
        }

        System.out.println("Matriz transposta:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
