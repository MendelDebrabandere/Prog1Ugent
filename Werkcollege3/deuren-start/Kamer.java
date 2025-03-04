/**
 * Stelt een kamer voor in een (muizen)huis. Elke kamer heeft een naam en houdt bij
 * hoeveel muizen er in die kamer aanwezig zijn. 
 */
public class Kamer {

    private String naam;
    
    private int aantal; // aantal muizen aanwezig in de kamer

    /**
     * Een nieuwe kamer.
     * @param naam Naam van de kamer, bijvoorbeeld "de keuken"
     * @param startAantal Aantal muizen dat reeds aanwezig is in de kamer.
     */
    public Kamer(String naam, int startAantal) {
        this.aantal = startAantal;
        this.naam = naam;
    }

    public void vermeerderMuizen() {
        aantal ++;
        System.out.println(aantal + " muizen in " + naam);
    }
    
    public void verminderMuizen() {
        aantal --;
        System.out.println(aantal + " muizen in " + naam);
    }
}
