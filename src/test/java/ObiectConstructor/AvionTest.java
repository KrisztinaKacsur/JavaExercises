package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test
    public void metodaTest (){

        Avion firstAvion = new Avion("Pasageri", "Boeing", "B127", 100,
                "Kerosen");
        firstAvion.prezentareAvion();

        Avion secondAvion = new Avion("Pasageri" , "Boeing","B300", 300,
                "Eco");
        secondAvion.prezentareAvion();

        Avion thirdAvion = new Avion("Pasageri", "Boeing", "C450", 400,
                "EcoPlus", 800);
        thirdAvion.prezentareAvion();

        //Am creat un branch local nou: mainCopy
    }
}
