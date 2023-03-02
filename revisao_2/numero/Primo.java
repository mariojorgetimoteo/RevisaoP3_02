package revisao_2.numero;

import java.util.Random;

public class Primo {
    public static void main(String[] args) {
        // inteiro randomico
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(10);
        System.out.println(primo(num));
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
