package edu.epam.cycles.task1;

//  Напишите программу, где пользователь вводит любое целое положительное число.
//  А программа суммирует все числа от 1 до введенного пользователем числа

import java.util.*;

public class PositiveSumm {

    public static void main(String[] args) {

        int number = 0, result = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter your positive number: ");
            number = input.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Sorry, but your input is not number!");
        }

        if (number <= 0) {

            System.out.println("Unfortunately, your number is negative or less than 1.");
        }

        for (int counter = 1; counter <= number; counter++) {

            result += counter;
        }

        System.out.println("Summ of all positive numbers from 1 to " + number + " is " + result + "!");
    }
}
