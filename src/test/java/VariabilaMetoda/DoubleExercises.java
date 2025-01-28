package VariabilaMetoda;

import org.testng.annotations.Test;

public class DoubleExercises {

    @Test
    public void calcTest(){
        volumeOfCylinderCalc(125.3, 89.7);
        fahrenheitToC(91.3);
        hypotenuseCalc(56.7, 58.3);
    }


        /*Calculate the Volume of a Cylinder
        Initialize two doubles radius and height for a cylinder.
        Calculate and print the volume of the cylinder (use Math.PI for π).*/

    public void volumeOfCylinderCalc(double paramHeight, double paramRadius){
        double volume = Math.PI * (paramHeight * paramRadius) * paramHeight;
        System.out.println("The volume of the Cylinder is: " + volume);
    }


        /*Convert Fahrenheit to Celsius
        Initialize a double Fahrenheit with any value. Convert this to Celsius and print the result.
        C = (°F - 32) × 5/9*/

    public void fahrenheitToC (double paramFahrenheit){
        double celsius = (paramFahrenheit -32 ) * 5 / 9;
        System.out.println(paramFahrenheit + " Fahrenheits = " + celsius + " C");

    }


        /*Calculate the Hypotenuse of a Right-Angled Triangle
        Given the lengths of the two shorter sides of a right-angled triangle, calculate the length of the hypotenuse.
        Use Pythagoras theorem.*/

    public void hypotenuseCalc (Double paramSideA, Double paramSideB){
        double hypotenuse = Math.sqrt(Math.pow(paramSideA,2) + Math.pow(paramSideB,2));
        System.out.println("The hypotenuse of the  rightAngledTriangle: " + hypotenuse + " cm");

    }

}
