package Questoes.primeira;

public class Calculator {
    /**
     * Return x + y
     */
    public int sum(int x, int y) {
        return x + y;
    }

    public int dif(int x, int y) {
        return x - y;
    }

    public int mult(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int exp(int x, int y) {
        int pw = 1;
        for (int i = 0; i < y; i++) {
            pw = pw * x;
        }
        return pw;
    }
}
