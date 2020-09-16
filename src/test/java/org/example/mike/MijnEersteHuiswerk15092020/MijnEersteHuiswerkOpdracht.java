package org.example.mike.MijnEersteHuiswerk15092020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

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

    //Tests die drie simpele holle pyramides op gevulde achtergrond met punt naar boven, rechts printen in verschillende niveaus en kolommen
    @Test
    void PrintHolle2DPyramidesGevuldeAchtergrondMetPuntNaarBovenVanTweeDrieEnVijfNiveaus(){
        print2DHollePyramideGevuldeAchtergrondMetPuntNaarBovenVanTweeNiveaus();
        voegWitRegelToe();

        print2DHollePyramideGevuldeAchterGrondMetPuntNaarBovenVanDrieNiveaus();
        voegWitRegelToe();

        print2DHollePyramideGevuldeAchterGrondMetPuntNaarBovenVanVijfNiveaus();
    }

    //Tests
    @Test
    void maaktEenPyramideMetPuntNaarBovenVanIngevuldeAantalNiveausMetIngevuldeSymbool() {

        int aantalRegels = vraagOmInvoerVanEenGeheelGetalVoorBepalenAantalRijenOfKolommen("Uit hoe veel niveaus wilt u dat de pyramide bestaat?");

        String symboolPyramide = vraagOmInvoerVanEenSymbool("Uit welk symbool wilt u dat de pyramide bestaat?");

        tekenEenPyramideMetPuntNaarBovenMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(aantalRegels, symboolPyramide);
    }

    @Test
    void maaktEenPyramideMetPuntNaarBenedenVanIngevuldeAantalNiveausMetIngevuldeSymbool() {

        int aantalRegels = vraagOmInvoerVanEenGeheelGetalVoorBepalenAantalRijenOfKolommen("Uit hoe veel niveaus wilt u dat de pyramide bestaat?");

        String symboolPyramide = vraagOmInvoerVanEenSymbool("Uit welk symbool wilt u dat de pyramide bestaat?");

        tekenEenPyramideMetPuntNaarBenedenMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(aantalRegels, symboolPyramide);
    }

    @Test
    void maaktEenPyramideMetPuntNaarRechtsVanIngevuldeAantalKolommen(){
        int aantalKolommen = vraagOmInvoerVanEenGeheelGetalVoorBepalenAantalRijenOfKolommen("Uit hoe veel kolommen wilt u dat de pyramide bestaat?");

        String symboolPyramide = vraagOmInvoerVanEenSymbool("Uit welk symbool wilt u dat de pyramide bestaat?");

        tekenEenPyramideMetPuntNaarRechtsMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(aantalKolommen,symboolPyramide);
    }

    @Test
    void maaktEenPyramideMetPuntNaarLinksVanIngevuldeAantalKolommen(){
        int aantalKolommen = vraagOmInvoerVanEenGeheelGetalVoorBepalenAantalRijenOfKolommen("Uit hoe veel kolommen wilt u dat de pyramide bestaat?");

        String symboolPyramide = vraagOmInvoerVanEenSymbool("Uit welk symbool wilt u dat de pyramide bestaat?");

        tekenEenPyramideMetPuntNaarLinksMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(aantalKolommen,symboolPyramide);
    }

    @Test
    void maaktEenHollePyramideMetPuntNaarBovenOpGevuldeAchtergrondVanIngevuldeAantalNiveausMetIngevuldeSymbool() {

        int aantalRegels = vraagOmInvoerVanEenGeheelGetalVoorBepalenAantalRijenOfKolommen("Uit hoe veel niveaus wilt u dat de pyramide bestaat?");

        String symboolPyramide = vraagOmInvoerVanEenSymbool("Uit welk symbool wilt u dat de achtergrond bestaat?");

        tekenEenHollePyramideMetPuntNaarBovenOpGevuldeAchtergrondMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(aantalRegels, symboolPyramide);
    }



    //-----------------------------------------------------------
    //Methodes
    int vraagOmInvoerVanEenGeheelGetalVoorBepalenAantalRijenOfKolommen(String invoerBericht){
        Scanner scanner = new Scanner(System.in);
        System.out.println(invoerBericht);
        int ingevoerdGeheelGetal = scanner.nextInt();
        return ingevoerdGeheelGetal;
    }

    String vraagOmInvoerVanEenSymbool(String invoerBericht){
        Scanner scanner = new Scanner(System.in);
        System.out.println(invoerBericht);
        String ingevoerdSymbool = scanner.next();
        return ingevoerdSymbool;
    }

    void tekenEenPyramideMetPuntNaarBovenMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(int totaalAantalRegels, String symboolPyramide){
        //Note we beginnen bij 1; eerste regel is dan 1
        System.out.println("Dit is de aangevraagde pyramide van " + totaalAantalRegels + " niveaus:");
        for (int regel = 1; regel <= totaalAantalRegels; regel = regel + 1) {
            tekenEenRegelVanDePyramideMetPuntNaarBovenOfBeneden(regel, totaalAantalRegels, symboolPyramide);
        }
    }

    void tekenEenPyramideMetPuntNaarBenedenMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(int totaalAantalRegels, String symboolPyramide){
        System.out.println("Dit is de aangevraagde pyramide van " + totaalAantalRegels + " niveaus:");
        for (int regel = totaalAantalRegels; regel >= 1; regel = regel - 1) {
            tekenEenRegelVanDePyramideMetPuntNaarBovenOfBeneden(regel, totaalAantalRegels, symboolPyramide);
        }
    }

    void tekenEenPyramideMetPuntNaarRechtsMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(int totaalAantalKolommen, String symboolPyramide){
        System.out.println("Dit is de aangevraagde pyramide van " + totaalAantalKolommen + " kolommen:");
        int aantalRegels = (totaalAantalKolommen * 2) - 1;

        for (int regel = 1; regel <= aantalRegels; regel = regel + 1) {
            tekenEenRegelVanDePyramideMetPuntNaarRechts(regel, aantalRegels, symboolPyramide);
        }
    }

     void tekenEenPyramideMetPuntNaarLinksMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(int totaalAantalKolommen, String symboolPyramide) {
        System.out.println("Dit is de aangevraagde pyramide van " + totaalAantalKolommen + " kolommen:");
        int aantalRegels = (totaalAantalKolommen * 2) - 1;

        for (int regel = 1; regel <= aantalRegels; regel = regel + 1) {
            tekenEenRegelVanDePyramideMetPuntNaarLinks(regel, aantalRegels, totaalAantalKolommen, symboolPyramide);
        }
    }


    void tekenEenRegelVanDePyramideMetPuntNaarBovenOfBeneden(int regel, int totaalAantalRegels, String symboolPyramide){
        //het aantal spaties links van de pyramide
        // is gelijk aan het aantal regels min de regel op welke de loop is
        for (int index = 0; index < (totaalAantalRegels - regel); index = index + 1) {
            System.out.print(" ");
        }

        //het aantal plusjes is hetzelfde als de regel op welke de loop is
        for (int index = 0; index < regel; index = index + 1) {
            System.out.print(symboolPyramide);
            System.out.print(" ");
        }

        //rechts hetzelfde als links van de pyramide
        for (int index = 0; index < (totaalAantalRegels - regel); index = index + 1) {
            System.out.print(" ");
        }

        //linebreak
        System.out.println("");
    }

    void tekenEenRegelVanDePyramideMetPuntNaarRechts(int regel, int totaalAantalRegels, String symboolPyramide){
        //tot en met de punt van het driehoek (op de helft) neemt het aantal plusjes toe
        if(regel <= (Math.ceil(totaalAantalRegels/2))) {
            //het aantal plusjes is hetzelfde als de regel op welke de loop is
            for (int index = 0; index < regel; index = index + 1) {
                System.out.print(symboolPyramide);
                System.out.print(" ");
            }
        }
        else if(regel > (totaalAantalRegels/2)) {
            //afnemende aantal plusjes vanaf de punt
            for (int index = 0; index <= (totaalAantalRegels - regel); index = index + 1) {
                System.out.print(symboolPyramide);
                System.out.print(" ");
            }
        }
        //linebreak
        System.out.println("");
    }

    void tekenEenRegelVanDePyramideMetPuntNaarLinks(int regel, int totaalAantalRegels, int totaalAantalKolommen, String symboolPyramide){
        //tot en met de punt van het driehoek (op de helft) neemt het aantal plusjes toe
        //Verschil met punt naar rechts is dat nu ook spaties toegevoegd moeten worden wanneer er geen +'jes worden toegevoegd

        if(regel < totaalAantalKolommen) {
            //het aantal spaties aan de linker kant
            // is gelijk aan het  aan het aantal kolommen min de rij waar de loop is
            for (int index = 0; index < (totaalAantalKolommen - regel); index = index + 1) {
                System.out.print("  ");
            }

            //het aantal plusjes is hetzelfde als de regel op welke de loop is
            for (int index = 0; index < regel; index = index + 1) {
                System.out.print(symboolPyramide);
                System.out.print(" ");
            }
        }
        else if(regel == totaalAantalKolommen) {
            //geen spaties aan de linker kant
            //het aantal plusjes is hetzelfde als de regel op welke de loop is
            for (int index = 0; index < regel; index = index + 1) {
                System.out.print(symboolPyramide);
                System.out.print(" ");
            }
        }
        else if(regel > totaalAantalKolommen) {
            //het aantal spaties aan de linker kant
            // is gelijk aan het  aan het aantal kolommen min (het aantal regels min de rij waar de loop is)
            for (int index = 0; index < (regel - totaalAantalKolommen); index = index + 1) {
                System.out.print("  ");
            }

            //afnemende aantal plusjes vanaf de punt
            for (int index = 0; index <= (totaalAantalRegels - regel); index = index + 1) {
                System.out.print(symboolPyramide);
                System.out.print(" ");
            }
        }
        //linebreak
        System.out.println("");
    }

    void tekenEenHollePyramideMetPuntNaarBovenOpGevuldeAchtergrondMetIngevoerdeSymboolEnVanIngevoerdeAantalRegels(int totaalAantalRegels, String symboolPyramide){
        System.out.println("Dit is de aangevraagde pyramide van " + totaalAantalRegels + " niveaus:");

        tekenEenVolleRegelVoorDeHollePyramideMetPuntNaarBoven(totaalAantalRegels,symboolPyramide);

        for (int regel = 1; regel <= totaalAantalRegels; regel = regel + 1) {
            tekenEenRegelVanDeHollePyramideMetPuntNaarBoven(regel, totaalAantalRegels, symboolPyramide);
        }

        tekenEenVolleRegelVoorDeHollePyramideMetPuntNaarBoven(totaalAantalRegels,symboolPyramide);
    }

    void tekenEenRegelVanDeHollePyramideMetPuntNaarBoven(int regel, int totaalAantalRegels, String symboolPyramide){
        //haast zelfde als oorspronkelijke pyramide maar met symbool en spaties vervangen en symbolen aan de zijkanten toegevoegd
        //houd rekening met regel +1 want er is een beginregel toegevoegd
        for (int index = 0; index < (totaalAantalRegels + 2 - (regel + 1)); index = index + 1) {
            System.out.print(symboolPyramide);
        }

        //het aantal plusjes is hetzelfde als de regel op welke de loop is
        for (int index = 0; index < regel; index = index + 1) {
            System.out.print(" ");
            System.out.print(" ");
        }

        //rechts hetzelfde als links van de pyramide
        for (int index = 0; index < (totaalAantalRegels + 2 - (regel + 1)); index = index + 1) {
            System.out.print(symboolPyramide);
        }

        //linebreak
        System.out.println("");
    }
    void tekenEenVolleRegelVoorDeHollePyramideMetPuntNaarBoven(int totaalAantalRegels, String symboolPyramide){
        for (int index = 0; index <= (totaalAantalRegels * 2) + 1; index = index + 1) {
            System.out.print(symboolPyramide);
        }
        System.out.println("");
    }


    void voegWitRegelToe(){
        System.out.println();
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

    //----------------------------------------------------------------------------------------------------------------
    //Appendix
    //----------------------------------------------------------------------------------------------------------------
    //hier staan de originele tests om pyramides aan te maken voordat methodes zijn gebruikt om het leesbaarder te maken
    //----------------------------------------------------------------------------------------------------------------
    @Test
    void maaktEenPyramideMetPuntNaarBovenVanIngevuldeAantalNiveausMetIngevuldeSymboolOrigineleVersie() {
        Scanner scanner = new Scanner(System.in);

        //vraagt om aantal regels en legt deze vast als variabele
        System.out.println("Uit hoe veel niveaus wilt u dat de pyramide bestaat?");
        int aantalRegels = scanner.nextInt();

        //vraagt om symbool en legt deze vast als variabele
        System.out.println("Uit welk symbool wilt u dat de pyramide bestaat?");
        String symboolPyramide = scanner.next();

        //Note we beginnen bij 1; eerste regel is dan 1
        System.out.println("Dit is de aangevraagde pyramide van " + aantalRegels + " lagen.");
        for (int regel = 1; regel <= aantalRegels; regel = regel + 1) {
            //het aantal spaties links van de pyramide is gelijk aan het aantal regels min de regel op welke de loop is
            for (int index = 0; index < (aantalRegels - regel); index = index + 1) {
                System.out.print(" ");
            }

            //het aantal plusjes is hetzelfde als de regel op welke de loop is
            for (int index = 0; index < regel; index = index + 1) {
                System.out.print(symboolPyramide);
                System.out.print(" ");
            }

            //rechts hetzelfde als links van de pyramide
            for (int index = 0; index < (aantalRegels - regel); index = index + 1) {
                System.out.print(" ");
            }

            //linebreak
            System.out.println("");
        }
    }

    @Test
    void makenVanLiggendeDriehoek(){
        Scanner scanner2 = new Scanner(System.in);

        //vraagt om aantal regels en legt deze vast als variabele
        System.out.println("Uit hoe veel regels wilt u dat de liggende driehoek bestaat?");
        int aantalRegel =scanner2.nextInt();

        //Note we beginnen bij 1; eerste regel is dan 1
        System.out.println("Dit is de aangevraagde liggende driehoek van " + aantalRegel + " lagen.");
        for(int regel = 1; regel <= aantalRegel; regel = regel + 1)
        {
            //tot en met de punt van het driehoek neemt het aantal plusjes toe
            if(regel <= (Math.ceil(aantalRegel/2))) {
                //het aantal plusjes is hetzelfde als de regel op welke de loop is
                for (int index = 0; index < regel; index = index + 1) {
                    System.out.print("+");
                    System.out.print(" ");
                }
            }
            else if(regel > (aantalRegel/2)) {
                //afnemende aantal plusjes vanaf de punt
                for (int index = 0; index <= (aantalRegel - regel); index = index + 1) {
                    System.out.print("+");
                    System.out.print(" ");
                }
            }
            //linebreak
            System.out.println("");
        }
    }
}
