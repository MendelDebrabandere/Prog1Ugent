import java.util.ArrayList;

/**
 * Deze klasse bevat een aantal methoden waarvan 
 * de implementatie hier en daar toch nog te wensen overlaat. 
 * 
 * Herschrijf deze methoden zodat ze nog steeds werken, maar dan
 * op een 'mooiere' manier.
 */
public class NietZo {

    /**
     * Is een getal even of niet?
     */
    public boolean isEven(int getal){
        return (getal & 1) == 0;
    }
    
    /**
     * Drukt de rij 1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1 af
     */
    public void opEnAf(){ //ik vind dit best een elegante oplossing.
        int stap = 1;
        for (int i = 1; i > 0; i += stap) {
            System.out.println(i);
            if(i==10) {
                stap = -1;
            }
        }
    }
    
    /**
     * Druk de cijfers van een getal af, in leesbare vorm, van achter naar voor
     */
    public void cijfers (int getal) {
        String[] getallen = {  "nul",
                            "één",
                            "twee",
                            "drie",
                            "vier",
                            "vijf",
                            "zes",
                            "zeven",
                            "acht",
                            "negen"}; 
        
        if (getal < 0) {
           getal = - getal;
        }

        while (getal != 0) {
            int cijfer = getal % 10;
            getal /= 10;
            System.out.println(getallen[cijfer]);
        }
    }   

    /**
     * Bepaal de positie van een gegeven waarde in een gegeven tabel. Geef
     * -1 terug als de waarde zich niet in de tabel bevindt.
     */ 
    public int indexOf(double tabel[],double waarde) {
        for(int m = 0; m < tabel.length; m++) {
            if (waarde == tabel[m]) {
                return m;
            }
        }
        return -1;
    }

    /**
     * Druk een lijst van strings af, gescheiden door komma's
     */
    public void printLijst(ArrayList<String> lijst) {
        if (lijst.size() >= 1)
            System.out.print(lijst.get(0));
            
        for (int m = 1; m < lijst.size(); m++) {
            System.out.print(", " + lijst.get(m));
        }
        System.out.println();
    }
    
    /**
     * Ga na hoever je een tabel van getallen moet overlopen vooraleer
     * de cumulatieve som van de absolute waarden een bepaalde drempel 
     * overschrijdt.
     */
    public int maxAbsSomLengte(double[] tabel, double drempel) {
        double som = 0.0;
        for (int m = 0; m < tabel.length; m++)
        {
            if (tabel[m] > 0) {
                som += tabel[m];
            } else if (tabel[m] < 0) {
                som -= tabel[m];
            }  
            if(som>drempel) {
                return m;
            }
        }
        return tabel.length;
    }
    
    /**
     * Zoek het eerste negatieve getal in de tabel en geef dit terug.
     * Geef anders 0 terug.
     */
    public int eersteNegatief (int[] tab) {
        for (int getal: tab) {
           if (getal < 0) {
              return getal;
           }
        }
        return 0;
    }
    
    /**
     * Kijkt of het gegeven jaartal een schrikkeljaar voorstelt.
     */
    public void schrikkeljaar(int jaar) {
        if (jaar % 400 == 0 || (jaar % 100 != 0 && jaar % 4 == 0)) {
            System.out.println("Schrikkeljaar");
        } else {
            System.out.println("Geen schrikkeljaar");
        }
    }
    
    /**
     * Drukt af hoeveel keer 'stuk' voorkomt in 'tekst' zonder te overlappen.
     * Bijvoorbeeld: "gtg" komt "cgtcattcgtgtgtgagtg" drie keer voor, zonder overlappen.
     */
    public void herhalingen(String stuk, String tekst){
        int aantal = 0;
        
        for(int p = tekst.indexOf(stuk); p!=-1; p = tekst.indexOf(stuk, p)){
            aantal++;
            p += stuk.length();
        }
        
        System.out.println(stuk + " komt (zonder overlappingen) " + Integer.toString(aantal) + " keer voor in " + tekst);
    }
    

}
