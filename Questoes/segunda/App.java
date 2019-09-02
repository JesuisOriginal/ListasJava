package Questoes.segunda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Comparator comparator = new Comparator();
        Scanner inp = new Scanner(System.in);
        System.out.println("Informe os numeros separados por virgula");
        comparator.parser(inp.next());
    }
}
