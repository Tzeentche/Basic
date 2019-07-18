package edu.epam.cycles.task3;

//  Найти сумму квадратов первых ста чисел.

public class SumOfSquares {

    public static void main(String[] args) {

        int productOfPower = 0;

        for (int number = 1; number <= 100; number ++) {

            productOfPower += Math.pow(number, 2);
        }

        System.out.println("Product of sum powers of first 100 numbers is " + productOfPower);
    }
}
