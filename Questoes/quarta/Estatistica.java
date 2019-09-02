package Questoes.quarta;
import java.math.*;

public class Estatistica {
    private int maiorValor;

    public int getMaiorValor() {
        return maiorValor;
    }

    public Estatistica(int positiveInteger) {
        if (positiveInteger < 0) {
            System.out.println("Integer must be positive");
            System.exit(1);
        }
        this.maiorValor = positiveInteger;
    }

    public int sumToZero() {
        int sum = 0;
        for (int i = 0; i <= this.maiorValor; i++) {
            sum += i;
        }
        return sum;
    }

    public int variancia() {
//        int div = sumToZero();
        int var = 0;
        int med = sumToZero()/this.maiorValor;
        int sum = 0;
        int i = 0;
        do {
            sum += (i - med) * (i - med);
            i++;
        } while (i < this.maiorValor);
        var = sum / this.maiorValor -1;

        return var;
    }

    public void printOddEven() {
        int i = 0;
        while (i < this.maiorValor) {
            if (i % 2 == 0) {
                System.out.println(i + "Is Even");
            } else {
                System.out.println(i + "Is Odd");
            }
            i++;
        }
    }

}
