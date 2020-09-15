package org.example.mike.MijnEersteHuiswerk15092020;

import org.junit.jupiter.api.Test;

public class MijnEersteHuiswerkOpdracht {

    //Tests die drie simpele pyramides met punt naar boven, beneden, rechts en links printen in verschillende niveaus en kolommen
    @Test
    void Print2DPyramidesMetPuntNaarBovenVanTweeDrieEnVijfNiveaus(){
        printPyramideMetPuntNaarBovenVanTweeNiveaus();
        voegWitRegelToe();

        printPyramideMetPuntNaarBovenVanDrieNiveaus();
        voegWitRegelToe();

        printPyramideMetPuntNaarBovenVanVijfNiveaus();
    }

    @Test
    void Print2DPyramidesMetPuntNaarBenedenVanTweeDrieEnVijfNiveaus(){
        printPyramideMetPuntNaarBenedenVanTweeNiveaus();
        voegWitRegelToe();

        printPyramideMetPuntNaarBenedenVanDrieNiveaus();
        voegWitRegelToe();

        printPyramideMetPuntNaarBenedenVanVijfNiveaus();
    }

    @Test
    void Print2DPyramidesMetPuntNaarRechtsVanTweeDrieEnVijfKolommen(){
        printPyramideMetPuntNaarRechtsVanTweeKolommen();
        voegWitRegelToe();

        printPyramideMetPuntNaarRechtsVanDrieKolommen();
        voegWitRegelToe();

        printPyramideMetPuntNaarRechtsVanVijfKolommen();
    }


    @Test
    void Print2DPyramidesMetPuntNaarLinksVanTweeDrieEnVijfKolommen(){
        printPyramideMetPuntNaarLinksVanTweeKolommen();
        voegWitRegelToe();

        printPyramideMetPuntNaarLinksVanDrieKolommen();
        voegWitRegelToe();

        printPyramideMetPuntNaarLinksVanVijfKolommen();

    }

    //Methodes
    void voegWitRegelToe(){
        System.out.println("");
    }

    //punt naar boven
    void printPyramideMetPuntNaarBovenVanTweeNiveaus(){
        System.out.println(" + ");
        System.out.println("+++");
    }

    void printPyramideMetPuntNaarBovenVanDrieNiveaus(){
        System.out.println("  +  ");
        System.out.println(" +++ ");
        System.out.println("+++++");
    }

    void printPyramideMetPuntNaarBovenVanVijfNiveaus(){
        System.out.println("    +    ");
        System.out.println("   +++   ");
        System.out.println("  +++++  ");
        System.out.println(" +++++++ ");
        System.out.println("+++++++++");
    }

    //punt naar beneden
    void printPyramideMetPuntNaarBenedenVanTweeNiveaus(){
        System.out.println("+++");
        System.out.println(" + ");
    }

    void printPyramideMetPuntNaarBenedenVanDrieNiveaus(){
        System.out.println("+++++");
        System.out.println(" +++ ");
        System.out.println("  +  ");
    }

    void printPyramideMetPuntNaarBenedenVanVijfNiveaus(){
        System.out.println("+++++++++");
        System.out.println(" +++++++ ");
        System.out.println("  +++++  ");
        System.out.println("   +++   ");
        System.out.println("    +    ");
    }

    //punt naar rechts
    void printPyramideMetPuntNaarRechtsVanTweeKolommen(){
        System.out.println("+");
        System.out.println("++");
        System.out.println("+");
    }

    void printPyramideMetPuntNaarRechtsVanDrieKolommen(){
        System.out.println("+");
        System.out.println("++");
        System.out.println("+++");
        System.out.println("++");
        System.out.println("+");
    }

    void printPyramideMetPuntNaarRechtsVanVijfKolommen(){
        System.out.println("+");
        System.out.println("++");
        System.out.println("+++");
        System.out.println("++++");
        System.out.println("+++++");
        System.out.println("++++");
        System.out.println("+++");
        System.out.println("++");
        System.out.println("+");
    }

    //punt naar links
    void printPyramideMetPuntNaarLinksVanTweeKolommen(){
        System.out.println(" +");
        System.out.println("++");
        System.out.println(" +");
    }

    void printPyramideMetPuntNaarLinksVanDrieKolommen(){
        System.out.println("  +");
        System.out.println(" ++");
        System.out.println("+++");
        System.out.println("  ++");
        System.out.println(" +");
    }

    void printPyramideMetPuntNaarLinksVanVijfKolommen(){
        System.out.println("    +");
        System.out.println("   ++");
        System.out.println("  +++");
        System.out.println(" ++++");
        System.out.println("+++++");
        System.out.println(" ++++");
        System.out.println("  +++");
        System.out.println("   ++");
        System.out.println("    +");
    }
}
