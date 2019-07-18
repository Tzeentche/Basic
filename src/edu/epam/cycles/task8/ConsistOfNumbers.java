package edu.epam.cycles.task8;

//  Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

import java.util.*;
import java.lang.*;

public class ConsistOfNumbers {

    public static void main(String[] args) {

        String[] numbersPosition = {"First value", "Second value"};
        int[] numbersValue = new int[numbersPosition.length];

        Scanner input = new Scanner(System.in);

        try {

            for (int counter = 0; counter < numbersPosition.length; counter ++) {
                System.out.println("Please, enter " + numbersPosition + " : ");
                numbersValue[counter] = input.nextInt();

            }

        } catch (InputMismatchException e) {

            System.out.println(" ");
        }

        char[] firstNumber;
        firstNumber = numbersValue[0].toString().toCharArray();

        for (int counter2 = 0; counter2 < firstNumber.length; counter2 ++) {

            System.out.print(firstNumber[counter2] + " ");
        }

        System.out.println(" ");
    }
}
