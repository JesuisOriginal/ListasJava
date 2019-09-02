package Questoes.primeira;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe operacao");
        String resp = scan.nextLine();
        Calculator calculator = new Calculator();
        int x = 0,y =0, out;
        switch (resp) {
            case "+": {
                System.out.println("Informe X e y");
                x = scan.nextInt();
                y = scan.nextInt();
                System.out.println(calculator.sum(x,y));
                break;
            }
            case "-":{
                System.out.println("Informe X e y");
                x = scan.nextInt();
                y = scan.nextInt();
                System.out.println(calculator.dif(x, y));
                break;
            }
            case "/":{
                System.out.println("Informe X e y");
                x = scan.nextInt();
                y = scan.nextInt();
                System.out.println(calculator.div(x,y));
                break;
            }
            case "^":{
                System.out.println("Informe X e y");
                x = scan.nextInt();
                y = scan.nextInt();
                System.out.println(calculator.exp(x, y));
                break;
            }
            case "*":{
                System.out.println("Informe X e y");
                x = scan.nextInt();
                y = scan.nextInt();
                System.out.println(calculator.mult(x,y));
                break;

            }
            default: {
                System.out.println("Invalid");
                break;
            }
        }
    }
}
