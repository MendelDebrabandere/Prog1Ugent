import greenfoot.Greenfoot;

public class Richting  
{
    // We definiëren constanten voor alle mogelijke richtingen.
    public static final int LINKS = 0;
    public static final int RECHTS = 1;
    public static final int BOVEN = 2;
    public static final int ONDER = 3;
    
    public static final String[] TOETSNAMEN = { "left", "right", "up", "down" };
    
    // Deze array's beelden een richtingsconstante af op de horizontale resp. verticale verplaatsing
    // bij het bewegen in die richting.
    private static final int[] richtingX = new int[] { -1, 1, 0, 0 };
    private static final int[] richtingY = new int[] { 0, 0, -1, 1 };
    
    public static int getDeltaX(int richting) {
        return richtingX[richting];
    }
    
    public static int getDeltaY(int richting) {
        return richtingY[richting];
    }
    
    /**
     * Geeft de richting terug van de toets die nu is ingedrukt,
     * of negatief getal wanneer geen richtingstoets is ingedrukt
     */
    public static int getToetsRichting() {
        int pos = TOETSNAMEN.length - 1;
        while (pos >= 0 && ! Greenfoot.isKeyDown(TOETSNAMEN[pos]) ) {
            pos --;
        }
        return pos;
    }
    
    /**
     * Zijn de gegeven richtingen aan elkaar tegengesteld?
     */
    public static boolean zijnTegengesteld (int richting1,int richting2) {
        // truukje, kan ook op andere manieren met wat meer if's
        return richting1 + richting2 == 1 || richting1 + richting2 == 5;
    }
}
