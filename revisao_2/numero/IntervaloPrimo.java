package revisao_2.numero;

import java.util.Random;

public class IntervaloPrimo {
    public static void main(String[] args) {
        // Inteiros randomicos
        Random aleatorio = new Random();
        int x = aleatorio.nextInt(20);
        int y = aleatorio.nextInt(20);
       
        if (x < y) {
            for (int k = x; k <= y; k++) {
                if (primo(k)) {
                    System.out.print(" " + k);
                }
            }
        } else if (x > y) {
            System.out.println("A condição não foi sequida, tente novamente\n");
        }
    }


    public static boolean primo(int valor) {

        // Questão 3

        // casos em que o número não é primo
        if (valor <= 1) {
            return false;
        }
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                return false;
            }
        }

        return true;

    }
}
