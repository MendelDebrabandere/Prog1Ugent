/**
 * Deur met sensoren die kan detecteren hoe ver een muis in de deur staat.
 *
 * @author Rien Maertens
 */
public class Deur
{
    // het getal van de huidige toestand in het toestandsdiagram
    private int toestand;
    
    // toestand van de sensoren
    // 'true': er wordt een muis gedetecteerd
    // 'false': er wordt niets gedetecteerd
    private boolean linkerSensor;
    private boolean rechterSensor;
    
    // de aangrenzende kamers
    private Kamer linkerKamer;
    private Kamer rechterKamer;

    public Deur(Kamer links, Kamer rechts){
        linkerKamer = links;
        rechterKamer = rechts;
        linkerSensor = false;
        rechterSensor = false;
    }
    
    /**
     * Update het aantal muizen in de kamers omdat een muis van de linkerkamer
     * naar de rechterkamer is verplaatst.
     */
    private void muisVanLinksNaarRechts() {
        linkerKamer.verminderMuizen();
        rechterKamer.vermeerderMuizen();
    }
    
    /**
     * Update het aantal muizen in de kamers omdat een muis van de rechterkamer
     * naar de linkerkamer is verplaatst.
     */
    private void muisVanRechtsNaarLinks() {
        rechterKamer.verminderMuizen();
        linkerKamer.vermeerderMuizen();
    }
    
    /**
     * De linker sensor detecteert een muis.
     * De waarde van de sensor en de toestand van de deur wordt aangepast.
     */
    public void linkerSensorAan() {
        if (!linkerSensor){ // equivalent met linkerSensor == false
            linkerSensor = true;
            if (toestand == 0){
                toestand = 1; // muis komt de deur binnen
            } else if (toestand == 4) {
                toestand = 5; // muis stapt volledig in de deur
            } else if (toestand == 3) {
                toestand = 2; // muis keert terug
            }
        }
    }
    
    /**
     * De linker sensor detecteert geen muis.
     * De waarde van de sensor en de toestand van de deur wordt aangepast.
     */
    public void linkerSensorUit() {
        if (linkerSensor){ // equivalent met linkerSensor == true
            linkerSensor = false;
            if (toestand == 2){
                toestand = 3; // muis gaat verder naar rechts
            } else if (toestand == 6) {
                muisVanRechtsNaarLinks();
                toestand = 0; // muis is van rechts naar links gegaan
            } else if (toestand == 5) {
                toestand = 4; // muis is aan het terugkeren naar rechts
            } else if (toestand == 1) {
                toestand = 0; // muis is teruggekeerd naar links
            }
        }
    }
    
    /**
     * De rechter sensor detecteert een muis.
     * De waarde van de sensor en de toestand van de deur wordt aangepast.
     */
    public void rechterSensorAan() {
        if (!rechterSensor){ // equivalent met rechterSensor == false
            rechterSensor = true;
            if (toestand == 0){
                toestand = 4; // muis stapt in de deur vanaf rechts
            } else if (toestand == 1) {
                toestand = 2; // muis is volledig in de deur
            } else if (toestand == 6) {
                toestand = 5; // muis keert terug
            }
        }
    }
    
    /**
     * De rechter sensor detecteert geen muis.
     * De waarde van de sensor en de toestand van de deur wordt aangepast.
     */
    public void rechterSensorUit() {
        if (rechterSensor){ // equivalent met rechterSensor == true
            rechterSensor = false;
            if (toestand == 5){
                toestand = 6; // muis gaat verder naar links
            } else if (toestand == 3) {
                muisVanLinksNaarRechts();
                toestand = 0; // muis is van links naar rechts gegaan
            } else if (toestand == 4) {
                toestand = 0; // muis is teruggekeerd naar rechts
            } else if (toestand == 2) {
                toestand = 1; // muis is aan het terugkeren naar links
            }
        }
    }
}
