package edu.epam.cycles.task8;

//  Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

import java.util.*;
import java.lang.*;

public class ConsistOfNumbers {

    public static void main(String[] args) {

        String[] numbersPosition = {"First value", "Second value"};
        int[] numbersValue = new int[numbersPosition.length];
        int firstSize = 0;
        int secondSize = 0;
        String boofer = new String("");

        Scanner input = new Scanner(System.in);

        try {

            for (int firstCounter = 0; firstCounter < numbersPosition.length; firstCounter ++) {

                System.out.println("Please, enter " + numbersPosition[firstCounter] + " : ");
                numbersValue[firstCounter] = input.nextInt();
            }

            boofer += numbersValue[0];
            firstSize = boofer.length();

            boofer += numbersValue[1];
            secondSize = boofer.length();

            int [] firstDividing = new int[firstSize];

            for (int firstCounter = 0; firstCounter < firstSize; firstCounter ++) {

                firstDividing[firstCounter] = numbersValue[0] % 10;
            }

            int [] secondDividing = new int[firstSize];

            for (int secondCounter = 0; secondCounter < secondSize; secondCounter ++) {

                secondDividing[secondCounter] = numbersValue[1] % 10;
            }

            int [] finalArray = new int[firstSize + secondSize];

            System.out.println("Repeating numbers are: ");

            for (int dividerFirst = 0; dividerFirst < firstSize; dividerFirst ++) {

                for (int divideSecond = 0; divideSecond < secondSize; divideSecond ++) {

                    if (firstDividing[firstSize] == secondDividing[secondSize]) {

                        finalArray[firstSize] = firstDividing[firstSize];
                    }
                }

                System.out.print(finalArray[firstSize] + " ");

            }

            System.out.println(" ");

        } catch (InputMismatchException e) {

            System.out.println("You entered wrong value. You can try again.");
        }
    }
}
