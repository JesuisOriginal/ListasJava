package Questoes.quarta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a positive integer value: ");
        Estatistica stats = new Estatistica(input.nextInt());

        stats.printOddEven();

        System.out.println("Sum from 0 to " + stats.getMaiorValor() + " = " + stats.sumToZero());

        System.out.println("Variance: " + stats.variancia());
    }
}
