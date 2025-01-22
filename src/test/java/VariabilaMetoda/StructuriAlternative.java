package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative = if-then-else; switch-case

    @Test
    public void metodaTest (){
    verifyNumber(7);
    verifyNumber(3);
    verifyNumber(5);

    oddOrEven(0);
    oddOrEven(4);
    oddOrEven(-4);
    oddOrEven(3);
    oddOrEven(-1);
    oddOrEven(-8);
    }

    //verificam un numar mai mare decat 5

    public void verifyNumber(int givenNumber){
        if (givenNumber > 5) {
            System.out.println("Numarul " + givenNumber + " este mai mare decat 5");
        }
        else if (givenNumber < 5){
            System.out.println("Numarul " + givenNumber + " este mai mic decat 5");
        }
        else {
            System.out.println("Numarul " + givenNumber + " este egal cu 5");
        }
    }


    //verificam daca un numar este par pozitiv sau par negativ

    public void oddOrEven (int number){
        if (number>0){
            if (number % 2 == 0){
                System.out.println(number + " este par pozitiv");
            }
            else {
                System.out.println(number + " este impar pozitiv");
            }

        }
        else if (number < 0){
            if (number%2==0){
                System.out.println(number + " este par negativ");
            }
            else {
                System.out.println(number + " este impar negativ");
            }
        }
        else if (number == 0){
            System.out.println("Numarul introdus este 0");
        }

    }


}
