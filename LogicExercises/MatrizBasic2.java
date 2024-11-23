//1-Crie uma matriz 3x3 e preencha-a com os números de 1 a 9. Em seguida, use um laço for para imprimir todos os elementos da matriz, linha por linha.
//2-Mesma ideia, porém em vez de ter numeros pré-estabelecidos, o usuario ira preencher os numeros da matriz 3x3
import java.util.Scanner;
import java.io.IOException;

public class MatrizBasic2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //matriz pré-estabelecida
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //matriz feita pelo usuario
        int[][] matriz2 = new int[3][3];

        System.out.println("Preencha a matriz 3x3 com os números que quiser:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Digite o nº para a posição [" + i + "][" + j + "]: "); //começa com i e j = 0
                matriz2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matriz feita pelo user:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
