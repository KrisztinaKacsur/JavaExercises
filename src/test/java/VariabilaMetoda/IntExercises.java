package VariabilaMetoda;

import org.testng.annotations.Test;

public class IntExercises {

    @Test
    public void calcTest(){
        rectanglePerimeterCalc(364,250);
        minToSecCalc(13);
        areaOfSquareCalc(6);
    }


        /*Calculate the Perimeter of a Rectangle:
        Initialize two integers length and width with any values.
        Calculate and print the perimeter of a rectangle using these variables. */

    public void rectanglePerimeterCalc(int paramRectangleLength, int paramRectangleWidth){
        int rectanglePerimeter = 2 * (paramRectangleLength + paramRectangleWidth);
        System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter + " cm");
    }


        /*Convert Minutes into Seconds:
        Initialize an integer minutes with any value.
        Convert this into seconds and print the result.*/

    public void minToSecCalc(int paramMinute){
        int minToSecResult = paramMinute * 60;
        System.out.println(paramMinute + " minutes = " + minToSecResult + " seconds");
    }


        /*Calculate the Area of a Square
        Initialize an integer side representing the side of a square.
        Calculate and print the area of the square.*/

    public void areaOfSquareCalc(int paramSquareSide){
        int area = paramSquareSide * paramSquareSide;
        System.out.println("The area of the square is: " + area + " cm");
    }

}
