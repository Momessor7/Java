//Uma matriz identidade é uma matriz quadrada (onde o número de linhas é igual ao número de colunas) em que todos os elementos da diagonal principal são 1 e todos os outros elementos são 0.
//Crie um programa que verifique se uma matriz 3x3 dada é uma matriz identidade. Utilize laços for para percorrer a matriz e verificar a condição de matriz identidade.
import java.util.Scanner;
import java.io.IOException;

public class MatrizAdvanced2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = {
            {1, 0, 0}, //alterar os numeros da matriz ira mudar a resposta tambem
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean Identidade = true;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    Identidade = false;
                    break;
                }
            }
        }

        if(Identidade) {
            System.out.println("É uma matriz identidade.");
        } else {
            System.out.println("Não é uma matriz identidade.");
        }

        scan.close();
    }
}
