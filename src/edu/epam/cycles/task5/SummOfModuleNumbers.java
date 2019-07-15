package edu.epam.cycles.task5;

//  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
//  модуль которых больше или равен заданному е

import java.util.*;

public class SummOfModuleNumbers {

    public static void main(String[] args) {

        double[] rowValuesArray = new double[2];
        double e = 0, n = 0, a = 0;
        String[] numbersRow ={"First", "Last"};

        Scanner input = new Scanner(System.in);

        try {

            for (int counter1 = 0; counter1 < numbersRow.length; counter1++) {

                System.out.println("Please,enter " + numbersRow[counter1] + " value of numbers row: ");
                rowValuesArray[counter1] = input.nextDouble();

            }

            System.out.println("Please,enter value E : ");
            e = input.nextDouble();

        } catch (InputMismatchException e1) {

            System.out.println("Attention! You input wrong value!");
        }

        for (double counter2 = rowValuesArray[0]; counter2 <= rowValuesArray[1]; counter2 ++) {

//            a = (1 / (2 * counter2)) + (1 / (3 * counter2));

            a = Math.abs(1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n)));

            if (e <= a) {

                n += a;
            }
        }

        System.out.println("Row of number is " + a);

        System.out.println("Summ of row values, that less or equals " + e + " is " + n);
    }
}
