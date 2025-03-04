/**
 * Een kamer houdt bij hoeveel muizen hij bevat, en steekt de lamp aan of doet de lamp uit, indien nodig.
 */
public class Kamer {
    
    private int aantal;
    private Lamp lamp;

    /**
     * Constructor for objects of class Kamer
     */
    public Kamer(Lamp lamp, int startAantal)
    {
        this.aantal = startAantal;
        this.lamp = lamp;
    }

    public void vermeerderMuizen() {
        if (aantal == 0) {
            lamp.aan();
        }
        aantal++;
    }
    
    public void verminderMuizen() {
        aantal--;
        if (aantal == 0) {
            lamp.uit();
        }
    }
}
