package edu.epam.cycles.task7;

//Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры

import java.util.*;
import java.lang.*;

public class NaturalNumbers {

    public static void main(String[] args) {

        int divider, counterOfDividers = 0;
        int[] diapasoneOfnumbers = new int[2];
        String[] meaningsOfSection = {"First value","Last value"};

        Scanner input = new Scanner(System.in);

        try{

            for (int firstCounter = 0; firstCounter < meaningsOfSection.length; firstCounter++) {

                System.out.println("Please, enter natural natural number of " + meaningsOfSection[firstCounter] + "for section: ");
                diapasoneOfnumbers[firstCounter] = input.nextInt();
            }

        } catch (InputMismatchException e) {

            System.out.println(" ");
        }

        System.out.println("You entered diapason of numbers between M = " +
                diapasoneOfnumbers[0] + " and N = " + diapasoneOfnumbers[1] + ".");

        for (int diapasoneNumber = diapasoneOfnumbers[0]; diapasoneNumber <= diapasoneOfnumbers[1]; diapasoneNumber ++) {

            System.out.println("Divider for " + diapasoneNumber + " is: ");

            for (int secondCounter = 2; secondCounter <= diapasoneOfnumbers[1]; secondCounter++) {

                divider = diapasoneNumber % secondCounter;

                if (divider == 0 && diapasoneNumber != secondCounter) {

                    System.out.print(secondCounter + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
