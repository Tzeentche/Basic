package edu.epam.linear_programs.task2;

//  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//  x = ((b+(sqrt(b^2)+4*a*c))/(2*a)) - (((a^3)*c)+(1/(b^2))

import java.util.*;

public class FormulaValue {

    public static void main(String[] args) {

        double resultIs;
        double[] param = new double[3];
        char[] value = {'A', 'B', 'C'};

        Scanner input = new Scanner(System.in);

        try {

            for (int counter = 0; counter < param.length; counter ++) {

                System.out.println("For equation \"x = ((b+(sqrt(b^2)+4*a*c))/(2*a)) - " +
                        "(((a^3)*c)+(1/(b^2))\", please, enter numeral value " + value[counter] + ": ");
                param[counter] = input.nextDouble();
            }

            resultIs = ((param[1] + (Math.sqrt(Math.pow(param[1], 2) + 4 * param[0] * param[2]))) /
                    (2 * param[0])) - ((Math.pow(param[0], 3) * param[2]) + (1 / (Math.pow(param[1],2))));

            System.out.println("Function value is " + resultIs);

        } catch (InputMismatchException e) {

            System.out.println("Genius, enter NUMERAL value! Try again.");
        }
    }

}
