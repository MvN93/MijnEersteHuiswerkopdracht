package org.example.mike.MijnEersteHuiswerk15092020;

import org.junit.jupiter.api.Test;

public class MijnEersteHuiswerkOpdracht {

    //Test die drie simpele pyramides met punt naar boven print in verschillende niveaus
    @Test
    void PrintPyramidesMetPuntNaarBovenVanTweeDrieEnVijfNiveaus(){
        printPyramideMetPuntNaarBovenVanTweeNiveaus();
        voegWitRegelToe();

        printPyramideMetPuntNaarBovenVanDrieNiveaus();
        voegWitRegelToe();

        printPyramideMetPuntNaarBovenVanVijfNiveaus();
    }

    //Methodes
    void voegWitRegelToe(){
        System.out.println("");
    }

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
}
