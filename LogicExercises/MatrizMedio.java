//Crie uma matriz 3x3 preenchida com os valores de 1 a 9 e calcule a soma de todos os seus elementos utilizando dois laços for. Ao final, exiba a soma dos elementos da matriz.
import java.util.Scanner;

public class MatrizMedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int soma = 0;

        for(int i = 0; i < 3; i++) { //linhas
            for(int j = 0; j < 3; j++) { //colunas
                soma = soma + matriz[i][j]; //ex: matriz[0][0] = elemento 1, j = 0 com i = 0, ele le 1, j = 1 com i = 0(ainda na primeira linha, porém com j = 1 está valendo 2)
            }
        }
        System.out.println("A soma total dos números é de: " + soma);

        scan.close();
    }
}
