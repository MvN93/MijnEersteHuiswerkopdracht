package org.example.mike.MijnEersteHuiswerk15092020;

import org.junit.jupiter.api.Test;

public class MijnEersteHuiswerkOpdracht {

    //Tests die drie simpele pyramides met punt naar boven, beneden, rechts en links printen in verschillende niveaus en kolommen
    @Test
    void Print2DPyramidesMetPuntNaarBovenVanTweeDrieEnVijfNiveaus(){
        print2DPyramideMetPuntNaarBovenVanTweeNiveaus();
        voegWitRegelToe();

        print2DPyramideMetPuntNaarBovenVanDrieNiveaus();
        voegWitRegelToe();

        print2DPyramideMetPuntNaarBovenVanVijfNiveaus();
    }

    @Test
    void Print2DPyramidesMetPuntNaarBenedenVanTweeDrieEnVijfNiveaus(){
        print2DPyramideMetPuntNaarBenedenVanTweeNiveaus();
        voegWitRegelToe();

        print2DPyramideMetPuntNaarBenedenVanDrieNiveaus();
        voegWitRegelToe();

        print2DPyramideMetPuntNaarBenedenVanVijfNiveaus();
    }

    @Test
    void Print2DPyramidesMetPuntNaarRechtsVanTweeDrieEnVijfKolommen(){
        print2DPyramideMetPuntNaarRechtsVanTweeKolommen();
        voegWitRegelToe();

        print2DPyramideMetPuntNaarRechtsVanDrieKolommen();
        voegWitRegelToe();

        print2DPyramideMetPuntNaarRechtsVanVijfKolommen();
    }

    @Test
    void Print2DPyramidesMetPuntNaarLinksVanTweeDrieEnVijfKolommen(){
        print2DPyramideMetPuntNaarLinksVanTweeKolommen();
        voegWitRegelToe();

        print2DPyramideMetPuntNaarLinksVanDrieKolommen();
        voegWitRegelToe();

        print2DPyramideMetPuntNaarLinksVanVijfKolommen();
    }

    //Tests die drie simpele holle pyramides op gevulde achtergrond met punt naar boven printen in verschillende niveaus en kolommen
    @Test
    void PrintHolle2DPyramidesGevuldeAchtergrondMetPuntNaarBovenVanTweeDrieEnVijfNiveaus(){
        print2DHollePyramideGevuldeAchtergrondMetPuntNaarBovenVanTweeNiveaus();
        voegWitRegelToe();

        print2DHollePyramideGevuldeAchterGrondMetPuntNaarBovenVanDrieNiveaus();
        voegWitRegelToe();

        print2DHollePyramideGevuldeAchterGrondMetPuntNaarBovenVanVijfNiveaus();
    }
    @Test
    void PrintHolle2DPyramidesGevuldeAchtergrondMetPuntNaarRechtsVanTweeDrieEnVijfNiveaus(){
        print2DHollePyramideGevuldeAchtergrondMetPuntNaarRechtsVanTweeNiveaus();
        voegWitRegelToe();

        print2DHollePyramideGevuldeAchterGrondMetPuntNaarRechtsVanDrieNiveaus();
        voegWitRegelToe();

        print2DHollePyramideGevuldeAchterGrondMetPuntNaarRechtsVanVijfNiveaus();
    }



    //Methodes
    void voegWitRegelToe(){
        System.out.println("");
    }

    //punt naar boven
    void print2DPyramideMetPuntNaarBovenVanTweeNiveaus(){
        System.out.println(" + ");
        System.out.println("+++");
    }
    void print2DPyramideMetPuntNaarBovenVanDrieNiveaus(){
        System.out.println("  +  ");
        System.out.println(" +++ ");
        System.out.println("+++++");
    }
    void print2DPyramideMetPuntNaarBovenVanVijfNiveaus(){
        System.out.println("    +    ");
        System.out.println("   +++   ");
        System.out.println("  +++++  ");
        System.out.println(" +++++++ ");
        System.out.println("+++++++++");
    }

    //punt naar beneden
    void print2DPyramideMetPuntNaarBenedenVanTweeNiveaus(){
        System.out.println("+++");
        System.out.println(" + ");
    }
    void print2DPyramideMetPuntNaarBenedenVanDrieNiveaus(){
        System.out.println("+++++");
        System.out.println(" +++ ");
        System.out.println("  +  ");
    }
    void print2DPyramideMetPuntNaarBenedenVanVijfNiveaus(){
        System.out.println("+++++++++");
        System.out.println(" +++++++ ");
        System.out.println("  +++++  ");
        System.out.println("   +++   ");
        System.out.println("    +    ");
    }

    //punt naar rechts
    void print2DPyramideMetPuntNaarRechtsVanTweeKolommen(){
        System.out.println("+");
        System.out.println("++");
        System.out.println("+");
    }
    void print2DPyramideMetPuntNaarRechtsVanDrieKolommen(){
        System.out.println("+");
        System.out.println("++");
        System.out.println("+++");
        System.out.println("++");
        System.out.println("+");
    }
    void print2DPyramideMetPuntNaarRechtsVanVijfKolommen(){
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
    void print2DPyramideMetPuntNaarLinksVanTweeKolommen(){
        System.out.println(" +");
        System.out.println("++");
        System.out.println(" +");
    }
    void print2DPyramideMetPuntNaarLinksVanDrieKolommen(){
        System.out.println("  +");
        System.out.println(" ++");
        System.out.println("+++");
        System.out.println(" ++");
        System.out.println("  +");
    }
    void print2DPyramideMetPuntNaarLinksVanVijfKolommen(){
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

    //holle pyramides gevulde achtergrond
    //punt naar boven
    void print2DHollePyramideGevuldeAchtergrondMetPuntNaarBovenVanTweeNiveaus() {
        System.out.println("+++++");
        System.out.println("++ ++");
        System.out.println("+   +");
        System.out.println("+++++");
    }

    void print2DHollePyramideGevuldeAchterGrondMetPuntNaarBovenVanDrieNiveaus() {
        System.out.println("+++++++");
        System.out.println("+++ +++");
        System.out.println("++   ++");
        System.out.println("+     +");
        System.out.println("+++++++");
    }

    void print2DHollePyramideGevuldeAchterGrondMetPuntNaarBovenVanVijfNiveaus() {
        System.out.println("+++++++++++");
        System.out.println("+++++ +++++");
        System.out.println("++++   ++++");
        System.out.println("+++     +++");
        System.out.println("++       ++");
        System.out.println("+         +");
        System.out.println("+++++++++++");
    }

    //punt naar rechts
    void print2DHollePyramideGevuldeAchtergrondMetPuntNaarRechtsVanTweeNiveaus() {
        System.out.println("++++");
        System.out.println("+ ++");
        System.out.println("+  +");
        System.out.println("+ ++");
        System.out.println("++++");
    }

    void print2DHollePyramideGevuldeAchterGrondMetPuntNaarRechtsVanDrieNiveaus() {
        System.out.println("+++++");
        System.out.println("+ +++");
        System.out.println("+  ++");
        System.out.println("+   +");
        System.out.println("+  ++");
        System.out.println("+ +++");
        System.out.println("+++++");
    }

    void print2DHollePyramideGevuldeAchterGrondMetPuntNaarRechtsVanVijfNiveaus() {
        System.out.println("++++++");
        System.out.println("+ ++++");
        System.out.println("+  +++");
        System.out.println("+   ++");
        System.out.println("+    +");
        System.out.println("+   ++");
        System.out.println("+  +++");
        System.out.println("+ ++++");
        System.out.println("++++++");
    }
}
