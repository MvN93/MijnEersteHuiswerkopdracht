package org.example.mike.MijnEersteHuiswerk15092020;

import org.junit.jupiter.api.Test;

public class MijnEersteHuiswerkOpdracht {

    //Test die drie simpele pyramides met punt naar boven print in verschillende niveaus
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
    void Print2DPyramidesMetPuntNaarRechtsVanTweeDrieEnVijfNiveaus(){
    }

    @Test
    void Print2DPyramidesMetPuntNaarLinksVanTweeDrieEnVijfNiveaus(){

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
}
