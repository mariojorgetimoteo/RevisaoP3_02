package revisao_2.fatorial;

import java.util.Random;

public class Fatorial {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        System.out.println("------R-------");
        int z = aleatorio.nextInt(5);
        // recursiva
        System.out.println(fatorial(z));
        // normal
        System.out.println("\n------Normal-------\n");
        System.out.println(factorialNormal(z));
        
    }

    // Questão 5 - fatorial
    public static int fatorial(int fatorialNumb) {
        if (fatorialNumb == 0) {
            return 1;
        } else {
            return fatorialNumb * fatorial(fatorialNumb - 1);
        }
    }

    // Questão 5 - normal
    public static int factorialNormal(int z) {
        int base = 1;
        for (int i = 1; i <= z; i++) {
            base *= i;
        }
        return base;
    }
}
