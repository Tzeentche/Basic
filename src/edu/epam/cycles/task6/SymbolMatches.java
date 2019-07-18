package edu.epam.cycles.task6;

//  Вывести на экран соответствий(я?) между символами и их численными обозначениями в памяти компьютера

import java.io.IOException;

public class SymbolMatches {

    public static void main(String[] args) {

        char symbol = '.';
        int nominator;

        try {

            System.out.println("Please, enter symbol, which numeric value you want to get: ");
            symbol = (char)System.in.read();

        } catch (IOException e) {

            System.out.println("Sorry, you entered wrong value!");
        }

        nominator = symbol;
        System.out.println("Value of symbol is " + nominator);
    }
}
