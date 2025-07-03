package Exceptions;

public class ExceptionOne {

    /*Ce sunt exceptiile?
    Reprezinta situatii care apar in timpul executiei unui program, care determina oprirea acestuia
    Ofera un mecanism eficient de identificare si rezolvare a erorilor
    Sunt modelate sub forme de Clase predefinite (clasa Error, Exception, RunTime Exception),
    dar se pot arunca si exceptii personalizete.
    Exceptiile sunt gestionate prin: try - catch si finally

    Sunt 2 tipuri mari de exceptii: checked si unchecked
    CHECKED = exceptii de compilare - nu se poate rula sau buildui proiectul.
    Ex: SQLException, IOException, ClassNotFoundException

    UNCHECKED = exceptii de run time care sunt ignorate in timpul compilarii dar sunt aruncate in timpul executiei programului
    Ex: NullPointerException, ArrayIndexOutOfBound, ArithmeticException

    Throw = cuvand cheie care arunca exceptia intr-un mod explicit de la o metoda sau un bloc de cod
    Throws = cuvand cheie care se foloseste odata cu metodata, care poate arunca un tip sau mai multe de exceptii
     */

    public static void main (String[] args) throws ExceptionCustom{
//       try {
//           System.out.println(12/0);
//       } catch (ArithmeticException e){
//           System.out.println("Error Arithmetic exception thrown: " + e.getMessage());
 //      }
        try {
            int[] numbers = new int[10];
            numbers[11] = 5;
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            throw new ExceptionCustom("Eroare personalizata!");
        } finally {
            System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa!");
        }
    }

}
