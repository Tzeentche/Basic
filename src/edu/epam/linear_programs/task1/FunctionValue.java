package edu.epam.linear_programs.task1;

//  Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

import java.util.*;

public class FunctionValue {

    public static void main(String[] args) {

        double result;
        double[] param = new double[3];
        char[] val = {'A', 'B', 'C'};

        Scanner input = new Scanner(System.in);

        try {

            for (int counter = 0; counter < param.length; counter ++) {

                System.out.println("For equation \"z = ((a - 3) * b / 2) + c\", please, enter numeral value " + val[counter] + ": ");
                param[counter] = input.nextDouble();
            }

            result = ((param[0] - 3) * param[1] / 2) + (param[2]);
            System.out.println("Function value is " + result);

        } catch (InputMismatchException e) {

            System.out.println("Genius, enter NUMERAL value! Try again.");
        }
    }

}
