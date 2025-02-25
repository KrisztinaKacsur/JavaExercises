package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    /*o colectie de anumite obiecte care fac parte dintr-o anumita categorie
    Multimile se pot reprezenta in mai multe feluri - in mai multe limbaje de programare
    multimi: array, list, map*/

    @Test
    public void testMethod(){
        colegiCursArray();
        colegiCursLista();
        categoriiObiecte();
        tariOrase();
    }

    //Exemplu array

    public void colegiCursArray (){
        String[] colegi = new String[6];
        colegi[0] = "Krisz";
        colegi[1] = "Ana";
        colegi[2] = "Mihai";
        colegi[3] = "Irina";
        colegi[4] = "Vlad";
        colegi[5] = "Alex";

        //de la cat pornim, pana la cat ne ducem; din cat in cat crestem
        for (int index = 0; index<colegi.length; index++){
            System.out.println("Numele colegului este: " + colegi[index]);
        }
    }

    //Exemplu Lista

    public void colegiCursLista (){
        List<String> colegi = new ArrayList<>();
        colegi.add("Krisz");
        colegi.add("Ana");
        colegi.add("Mihai");
        colegi.add("Irina");
        colegi.add("Vlad");
        colegi.add("Alex");

        int index = 0;
        while (index<colegi.size()){
            System.out.println("Numele colegului este: " + colegi.get(index));
            index++;
        }
    }

    //Exemplu Map - cheie = valoare

    public void categoriiObiecte (){
        HashMap<String,String> obiecte = new HashMap<>();
        obiecte.put("obiect","laptop");
        obiecte.put("fruct","mar");
        obiecte.put("floare","trandafir");

        for (String key: obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));
        }
    }

    public void tariOrase (){
        HashMap <String, List<String>> clasificare = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Oradea");
        oraseRomania.add("Iasi");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Florenta");
        oraseItalia.add("Napoli");

        List<String> oraseSapnia = new ArrayList<>();
        oraseSapnia.add("Barcelona");
        oraseSapnia.add("Madrid");
        oraseSapnia.add("Malaga");

        clasificare.put("Romania" , oraseRomania);
        clasificare.put("Italia" , oraseItalia );
        clasificare.put("Spania" , oraseSapnia);

        for (String key: clasificare.keySet()){
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));
        }

    }
}
