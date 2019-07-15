package edu.epam.Branching.task3;

//  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой

import java.util.*;

public class ThreePointsCoordinate {

    public static void main(String[] args) {

        double[] x = new double[4];
        double[] y = new double[4];
        double a, b, c, perimeter, square;
        char[] pointName = {'A', 'B', 'C'};

        Scanner input = new Scanner(System.in);

        try {

            for (int counter = 0; counter < pointName.length; counter ++) {
                System.out.println("Please, enter X-coordinate for point " + pointName[counter] + ":");
                x[counter] = input.nextDouble();

                System.out.println("Please, enter Y-coordinate for point " + pointName[counter] + ":");
                y[counter] = input.nextDouble();

            }
        } catch (InputMismatchException e) {

            System.out.println("Please, for next time enter NUMERAL value! You can try again.");
        }

        a = Math.sqrt(Math.pow(Math.abs(x[0] - x[1]), 2) + Math.pow(Math.abs(y[0] - y[1]), 2));
        b = Math.sqrt(Math.pow(Math.abs(x[1] - x[2]), 2) + Math.pow(Math.abs(y[1] - y[2]), 2));
        c = Math.sqrt(Math.pow(Math.abs(x[0] - x[2]), 2) + Math.pow(Math.abs(y[0] - y[2]), 2));

        perimeter = (a + b + c) / 2;
        square = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));

        if (square == 0) {

            System.out.println("Our congratulations! These points are on the one line!");

        } else {

            System.out.println("It's so awful, but these points are on the different lines!");
        }
    }
}
