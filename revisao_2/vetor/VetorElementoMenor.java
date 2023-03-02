package revisao_2.vetor;

import java.util.Random;

public class VetorElementoMenor {
    public static void main(String[] args) {
        menor();
    }

    public static void menor() {
        System.out.println("\n-----Vetor -----");
        // Questão 2

        // Números randomicos que vai preencher o vetor
        Random valores = new Random();

        // Meu vetor de inteiros, com tamanho randomicos
        int[] vetorA = new int[valores.nextInt(10)];

        // variavel responsavel pelo menor valor
        int menor_valor = Integer.MAX_VALUE;

        // preencher meu vetor com números randomicos
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = valores.nextInt(100);
        }
        // percorre o vetor, inserir o menor valor na variavel responsavel
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < menor_valor) {
                menor_valor = vetorA[i];
            }
        }

        // Imprimir o vetor
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " . ");
        }

        System.out.println("\n----- Menor valor -----");
        // Imprimir o menor valor
        System.out.println(menor_valor);

        
    }
}
