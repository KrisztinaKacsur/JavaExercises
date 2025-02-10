package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      grades();
      printValuesWhile();
      printValuesDoWhile();
      printValuesFor();

    }

    //Structuri alternative: WHILE , FOR

    public static void grades (){
        System.out.println("Please enter a grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        while (grade<0 || grade >10){
            System.out.println("Your input value is " + grade + ". This is an invalid grade. " +
                    "Please enter a valid value between 1 and 10.");
            grade = scanner.nextInt();
        }
        System.out.println("The grade " + grade + " is valid, as it is between 1 and 10.");
    }

    //WHILE - se incrementeaza valoarea intiala -> se printeaza. Iar verifica conditia, iar incrementeaza si printeaza
    //pana se indeplineste conditia. Ex ajunge la 5. "Te gandesti si apoi vorbesti"

    public static void printValuesWhile(){
        int value = 1;
        while (value <= 5) {
            System.out.println("Valoarea este " + value);
            value++;
        }
        System.out.println("Valoarea dupa parcurgerea While este " + value);
    }

    //Do-Wile - "Prima data vorbesti, apoi gandesti"
    public static void printValuesDoWhile (){
        int value = 6;
        do {
            System.out.println("Valoarea este " + value);
            value++;
        } while (value<=5);
        System.out.println("Valoarea dupa parcurgerea Do-While este " + value);

    }

    //for(1.initializare valoare 2. verificare conditie 3.actiune -incrementam in cazul nostru) Sunt mai multe variatii.
    //Incrementare graduala

    public static void printValuesFor (){
        //int value = 1;
        for (int value = 1;value<=5;value++){
            System.out.println("Valoarea este " + value);
            //value++;
        }
    }
}