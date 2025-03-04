
/**
 * Objecten van deze klasse zijn verantwoordlijk voor één paar cijfers dat
 * onderdeel vormt van een display, hetzij het secondengedeelte, hetzij het minutengedeelte
 * 
 * 2016 (c) Kris Coolsaet Universiteit Gent
 */
public class Cijferpaar {
    
    // Velden
    ///////////
    
    private int teller;
    
    // Constructoren
    ////////////////
    
    /**
     * Constructor. Initialiseert de velden van dit object.
     */
    public Cijferpaar() {
        teller = 0;
    }
    
    // Methoden
    ///////////
    
    /**
     * Stelt een nieuwe waarde in voor de teller.
     * @param w nieuwe waarde
     */
    public void zetWaarde(int w) {
        teller = w;
    }
    
    /**
     * Verminder de waarde van de huidige teller met 1
     */
    public void verminderMet1() {
         teller = teller - 1;
    }
    
    /**
     * De huidige waarde van de teller
     */
    public int geefWaarde() {
        return teller;
    }
    
    /**
     * Geef de huidige waarde terug als een string van twee cijfers.
     */
    public String geefTijd() {
        if (teller > 9) {
            return "" + teller; // trucje om van een getal een string te maken
        } else {
            return "0" + teller;
        }
    }

}
