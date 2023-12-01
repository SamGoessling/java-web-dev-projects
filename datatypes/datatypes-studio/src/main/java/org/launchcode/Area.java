package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                //--prompts user--//
                System.out.println("Enter a radius: ");
                double radius = input.nextDouble();

                //--validation. checks if negative entered--//
                if (radius < 0) {
                    System.out.println("Error: Radius cannot be negative.");
                    //--re-prompts--//
                    continue;
                }

                //--calculates area using Circle.getArea() method--//
                double area = Circle.getArea(radius);

                //--displays calculated area--//
                System.out.println("The area of a circle of radius " + radius + " is: " + area);

                //--exits loop after success--//
                break;
            } catch (java.util.InputMismatchException e) {
                //--return for non-numeric input--//
                System.out.println("Error: Please enter a valid number.");
                //--clears invalid input--//
                input.next();
            }
        }

        //--close input--//
        input.close();
    }
}
