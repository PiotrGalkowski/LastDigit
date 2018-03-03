package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sets = scanner.nextInt();
        List<String[]> listOfSets = new ArrayList<>();

        for (int i = 0; i < sets; i++) {
            String[] set = scanner.next().split(",");
            listOfSets.add(set);
        }

        int score;
        int firstNumber;
        int secondNumber;

        for (String[] set: listOfSets){
            firstNumber = Integer.parseInt(set[0]);
            secondNumber = Integer.parseInt(set[1]);
            score = (int) Math.pow(firstNumber, secondNumber);
            String temp = String.valueOf(score);
            char lastDigit = temp.charAt(temp.length()-1);
            System.out.println(lastDigit);
        }
    }
}
