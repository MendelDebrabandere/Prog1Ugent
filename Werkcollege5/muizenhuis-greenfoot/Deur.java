/**
 * Deur met twee sensoren waarmee je kan detecteren of een muis van de ene kamer naar de andere
 * loopt. We noemen de beide kanten van een deur (en de overeenkomstige sensoren) 'links'
 * en 'rechts'.
 */
public class Deur
{
    // Vul de velden aan
    Kamer linkerKamer;
    Kamer rechterKamer;
    
    int toestand;
    
    // Maak een constructor met twee parameters, een voor de kamer aan de linkerkant
    // van de deur, een voor de kamer aan de rechterkant
    public Deur(Kamer linkerKamer, Kamer rechterKamer)
    {
        this.linkerKamer = linkerKamer;
        this.rechterKamer = rechterKamer;
        
        toestand = 0;
    }
    
    /**
     * De linker sensor detecteert een muis.
     */
    public void linkerSensorAan() {
        switch (toestand)
        {
            case 4:
                toestand = 5;
                break;
            case 0: 
                toestand = 1;
                break;
            case 3:
                toestand = 2;
                break;
        }
    }
    
    /**
     * De linker sensor detecteert geen muis.
     */
    public void linkerSensorUit() {
        switch (toestand)
        {
            case 6:
                toestand = 0;
                rechterKamer.verminderMuizen();
                linkerKamer.vermeerderMuizen();
                break;
            case 5:
                toestand = 4;
                break;
            case 2:
                toestand = 3;
                break;
            case 1:
                toestand = 0;
                break;
        }
    }
    
    /**
     * De rechter sensor detecteert een muis.
     */
    public void rechterSensorAan() {
        switch (toestand)
        {
            case 0:
                toestand = 4;
                break;
            case 6:
                toestand = 5;
                break;
            case 1:
                toestand = 2;
                break;
        }
    }
    
    /**
     * De rechter sensor detecteert geen muis.
     */
    public void rechterSensorUit() {
        switch (toestand)
        {
            case 5:
                toestand = 6;
                break;
            case 4:
                toestand = 0;
                break;
            case 3:
                toestand = 0;
                linkerKamer.verminderMuizen();
                rechterKamer.vermeerderMuizen();
                break;
            case 2:
                toestand = 1;
                break;
        }
    }
}
