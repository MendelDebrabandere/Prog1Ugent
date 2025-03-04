import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * class Main
 */
public class Main {
    
    private List<Character> verbodenTekens;
    private Scanner sc;

    public Main() {
        sc = new Scanner(System.in); // negeer deze lijn

        // Een voorbeeld van een lijst met verboden tekens.
        verbodenTekens = new ArrayList<Character>();
        verbodenTekens.add('\'');
        verbodenTekens.add(',');
        verbodenTekens.add('"');
        verbodenTekens.add(';');
    }

    private void test() {
        // Een wachtwoord is ten minste 8 en ten hoogste 128 tekens lang.
        String wachtwoord = leesInvoer("Kies een wachtwoord:", new Lengtecontroleur(8,128));
        System.out.println("Uw wachtwoord: " + wachtwoord + "\n");

        // Voorbeeld 2
        Beveiliger b1 = new Beveiliger(
              List.of (new VerbodenTekenopschoner(verbodenTekens), new Hoofdletteropschoner())
        );        
        String eenderWat1 = leesInvoer("Typ eender wat:", b1);
        System.out.println("Eender wat zonder verboden tekens en volledig in kleine letters: " + eenderWat1);

        // Voorbeeld 3
        String eenderWat2 = leesInvoer("Typ eender wat:", new Beveiliger (new ArrayList<>()));
        System.out.println("Eender wat: " + eenderWat2);

        Beveiliger b2 = new Beveiliger(
              List.of (new VerbodenTekenopschoner(verbodenTekens), new Lengtecontroleur(3,32), new Hoofdletteropschoner())
        );        
        String gebruikersnaam = leesInvoer("Geef uw gebruikersnaam en druk op ENTER:", b2);
        System.out.println("Uw gebruikersnaam: " + gebruikersnaam + "\n");
    }

    /**
     * Toon 'prompt' aan de gebruiker en laat de gebruiker iets intypen. Wat
     * de gebruiker ingetypt heeft, wordt dan verwerkt door 'verwerker'. Dit
     * wordt herhaald tot de invoer van de gebruiker geldig is volgens de
     * gegeven 'verwerker'.
     * @return De verwerkte invoer.
     */
    private String leesInvoer(String prompt, Helper verwerker) {
        // Negeer de implementatie van deze methode.
        System.out.println(prompt);
        String invoer = sc.nextLine();
        String verwerkteInvoer = verwerker.verwerk(invoer);
        while (verwerkteInvoer == null) {
            System.out.println("Ongeldig, probeer opnieuw.");
            System.out.println(prompt);
            invoer = sc.nextLine();
            verwerkteInvoer = verwerker.verwerk(invoer);
        }
        return verwerkteInvoer;
    }    

    public static void main(String[] args) {
        new Main().test();
    }

}
