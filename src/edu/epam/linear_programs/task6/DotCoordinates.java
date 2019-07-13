package edu.epam.linear_programs.task6;

//      Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//      принадлежит закрашенной области, и false — в противном случае

import java.util.*;

public class DotCoordinates {

    public static void main(String[] args) {

        double valueX, valueY;
        boolean result;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter coordinate for X : ");
            valueX = input.nextDouble();
            System.out.println("Please, enter coordinate for Y : ");
            valueY = input.nextDouble();

            System.out.println("Your's point coordinates for X = " + valueX + ", for Y = " + valueY);

            if (((-4.0 <= valueX) & (valueX <= 4.0) & (0.0 >= valueY) & (valueY >= -3.0))) {
                result = true;
            } else if ((-2.0 <= valueX) & (valueX <= 2.0) & (0.0 <= valueY) & (valueY <= 4.0)) {
                result = true;
            } else {
                result = false;
            }

            System.out.println(result);

        } catch (InputMismatchException e) {

            System.out.println("Genius, enter NUMERAL value! Try again.");
        }
    }
}
