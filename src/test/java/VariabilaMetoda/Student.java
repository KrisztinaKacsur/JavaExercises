package VariabilaMetoda;

import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

public class Student {

    //clasa = sablon care defineste proprietatile si comportamentul unei antitati specifice
    //intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui
    //nu este un practice bun sa ai mai multe clase cu acelasi nume
    //intr-o clasa putem defini proprietatile si actiunile entitatii
    //variabila = proprietatea unei clase
    // variabilele pot fi de 2 feluri: global si local
    //variabila globala = sunt vizibile peste tot in proiect
    //variabila locala = sunt vizibile unde sunt declarate
    // ca sa definim a variabila globala: accesscontrol (public) | tip variabila | nume variabila
    //cand definim o variabila nu este obligatoriu sa ii dam o valoare
    //metoda = actiunea unei clase
    // 2 tipuri de metode: void, returned

    public String Nume;
    public String Prenume;
    public int Varsta;
    public String Adresa;
    public double Inaltime;
    public float Greutate;
    public char Sex;
    public boolean AreDiploma;




    @Test
    public void prezentareStudent (){
        Nume = "Krisz";
        Prenume = "Kri";
        Varsta = 28;
        Adresa = "str Fericirii nr 42";
        Inaltime = 1.58;
        Greutate = 50.26f;
        Sex = 'F';
        AreDiploma = true;

        //System.out.println(Nume+" "+Prenume+ " " +Varsta+ " " + Adresa);
        //System.out.println(Inaltime);
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenume studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Inaltimea studentului este: " + Inaltime);
        System.out.println("Greutatea studentului este: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Are studentul diploma? " + AreDiploma);

        calculMedie();
        getSallary();
        System.out.println(getSallary());
    }

    public void calculMedie(){
        int notaUnu = 8;
        int notaDoi = 9;
        int notaTrei = 4;
        int medie = (notaUnu + notaDoi + notaTrei) / 3;
        System.out.println("Nota studentului este: " + medie);
    }

    //metoda return
    public int getSallary () {
        int sallary = 5000;
        return sallary;
    }
}
