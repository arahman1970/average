// calculate average of two double numbers
package com.company;
import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, average; // num3;

        System.out.print( "First value? " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second value? " );
        num2 = keyboard.nextDouble();
        average = (num1+num2) / 2;
        System.out.println("The avg value is : " + average);
    }
}