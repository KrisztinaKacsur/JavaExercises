package ObiectConstructor;

public class Avion {

    /*Constructor = are ca rol sa initializeze variabilele unei clase
    Recunoastem un constructor dupa numele clasei (numele clasei = numele constructorului; ex Avion)
    intr-o clasa putem avea N constructori care se diferentieaza dupa numarul sau tipul de parametrii
    Exista 2 tipuri de constructori: cu parametrii sau fara parametrii
    Intr-o clasa avem tot timpul un cosntructor default (fara parametrii)
    Constructorul trebuie sa fie public (poate fi si privat)

    Obiect = instanta unei clase
    Dintr-o clasa putem facem mai multe obiecte
    Ca sa initializam un obiect de folosim de cuvantul NEW
    Cand se initializeaza un obiect, se apeleaza constructorul clasei*/

    public String type;
    public String brand;
    public String model;
    public Integer passengerCapacity;
    public String fuelType;
    public Integer numberOfLuggages;

    public Avion (String type, String brand, String model, Integer passengerCapacity, String fuelType){
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
    }

    public Avion(String type, String brand, String model, Integer passengerCapacity, String fuelType, Integer numberOfLuggages) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
        this.numberOfLuggages = numberOfLuggages;
    }

    public void prezentareAvion (){
        System.out.println("The type of the plane is: " + type);
        System.out.println("Brand of the plane is: " + brand);
        System.out.println("The model of the plane is: " + model);
        System.out.println("The passenger capacity is: " + passengerCapacity);
        System.out.println("The fuel type is: " + fuelType);

        if (numberOfLuggages != null){
            System.out.println("The number of allowed luggage: " + numberOfLuggages);
        } else {
            System.out.println("The plane cannot be loaded with additional luggage");
        }

    }

}
