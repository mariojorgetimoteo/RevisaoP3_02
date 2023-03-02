package revisao_2.matrix;

import java.util.Random;

public class Matriz3x3 {
    
public static void main(String[] args) {
    matriz();
}

public static void matriz() {
    // Questão 1 - Imprimir uma matriz 3X3 Composta

    // Minha matriz de inteiros
    int[][] matriz = new int[3][3];

    // Números randomicos que vão preencher a matriz
    Random valores = new Random();

    // Preenchimento da matriz
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = valores.nextInt(200);
        }
    }

    System.out.println("--------Matriz Normal-------");
    // Imprimir os valores da matriz
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("--------Matriz Transposta-------");

    // Imprimir a matriz transposta
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[j][i] + " ");
        }
        System.out.println();
    }
    System.out.println();
}


}
