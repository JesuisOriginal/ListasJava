package Questoes.segunda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Comparator {

    private int big, secBig, inps[];

    public void parser(String input) {
        String[] tempArray;
        tempArray = input.split(",");
        System.out.println("length :" + tempArray.length);
        if (tempArray.length < 8 || tempArray.length > 8) {
            System.out.println("Tamanho invalido");
            System.exit(1);
        }
        ArrayList<Integer> tempArrayInt = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            tempArrayInt.add(Integer.parseInt(tempArray[i]));
        }
        Collections.sort(tempArrayInt);
        this.big = tempArrayInt.get(tempArrayInt.size() - 1);
        this.secBig = tempArrayInt.get(tempArrayInt.size() - 2);
        System.out.println("Primeiro maio: " + this.big + "\n Segundo Maior: " + this.secBig);
    }
}
