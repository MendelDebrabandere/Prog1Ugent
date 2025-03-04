
/**
 * Hoofdklasse van de toepassing. Vormt de interface met de elektronica van een schaakklok.
 * 
 * 2016 (c) Kris Coolsaet Universiteit Gent
 */
public class Schaakklok {
    
    // Velden
    ///////////
    
    private int speler; // 1 voor wit, 2 voor zwart
    
    private Klokje wit;
    
    private Klokje zwart;
    
    // Constructoren
    ////////////////
    
    /**
     * Constructor. Initialiseert de velden van dit object.
     */
    public Schaakklok() {
        wit = new Klokje();
        zwart = new Klokje();
        speler = 1;
    }
    
    // Methoden
    ///////////
    
    /**
     * Wordt opgeroepen wanneer een nieuwe wedstrijd begint.
     */
    public void herstart() {
        wit.herstart();
        zwart.herstart();
        speler = 1;
    }
    
    /**
     * Wordt elke seconde opgeroepen.
     */
    public void ontvangPuls() {
        if (speler == 1) {
            wit.ontvangPuls();
        } else {
            zwart.ontvangPuls();
        }
    }
    
    /**
     * Geef terug wat er op het display moet komen voor de opgegeven speler
     * @param s 1 wanneer je wit bedoelt, 2 voor zwart
     */
    public String geefTijd(int s) {
        if (s == 1) {
            return wit.geefTijd();
        } else {
            return zwart.geefTijd();
        }
    }
    
    /**
     * Geeft aan dat er een andere speler aan zet is
     */
    public void wisselSpeler() {
        if (speler == 1) {
            speler = 2;
        } else {
            speler = 1;
        }
    }

}
