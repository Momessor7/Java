//Crie uma matriz 3x3 de inteiros e preencha com valores quaisquer. Depois, calcule e imprima a soma de cada linha da matriz.
import java.util.Scanner;
import java.io.IOException;

public class MatrizMedio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3]; //criando matriz 3x3
        System.out.println("Insira os dados da matriz");
        for(int i = 0; i < 3; i++) { //percorrendo os elementos da linha
            for(int j = 0; j < 3; j++) { //percorrendo os elementos das colunas
                System.out.print("Insira o dado da posição [" + i + "] [" + j + "]: ");
                matriz[i][j] = scan.nextInt(); //inserindo os numero q quiser
            }
        }

        //calcular a soma das LINHAS da matriz
        for(int i = 0; i < 3; i++) {
            int soma = 0; //aqui ta o pulo do gato, onde reinicia a soma a cada for da linha feito
            for(int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": Soma = " + soma); //i+1 pois inicia em 0 e n tem como ser linha 0
        }

        scan.close();
    }
}
