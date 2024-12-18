package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest (){
        dateMasina("Audi","A4",2006);
        dateMasina("BMW","X5",2019);
        calculMedie(7.5,8.2);
        calculMedie(6.3,8.4);
    }


    public void dateMasina (String param1, String param2, Integer param3){
        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul de fabricatie este: " + anFabricatie);
    }

    //calculam media la 2 numere
    public void calculMedie (double nota1, double nota2){
        double rezultat = (nota1 + nota2)/2;
        System.out.println("Media celor 2 numere este: " + rezultat);

    }


}
