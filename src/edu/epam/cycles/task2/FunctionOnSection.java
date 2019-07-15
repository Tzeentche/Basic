package edu.epam.cycles.task2;

//  Вычислить значения функции на отрезке [а,b] c шагом h

import java.util.*;

public class FunctionOnSection {

    public static void main(String[] args) {

        double a = 0, b = 0, h = 0, x = a;
        double[] y = new double[2];

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter start-point of section: ");
            a = input.nextDouble();

            System.out.println("Please, enter finish-point of section: ");
            b = input.nextDouble();

            System.out.println("Please, enter step of section: ");
            h = input.nextDouble();

        } catch (InputMismatchException e) {

            System.out.println("It's wrong! Please,enter numeral values");
        }

        while (x <= b) {

            if (x > 2) {

                y[0] = x;
                y[1] = x;

            } else if (x <= 2) {

                y[0] = x * -1;
                y[1] = x;
            }

            System.out.println("Value of \"Y\" is " + y[0] + " " + y[1]);

            x += h;
        }
    }
}
