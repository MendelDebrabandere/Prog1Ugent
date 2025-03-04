/**
 * Oefening Programmeren.
 * 
 * @author Benoit Desouter et al.
 * @version oktober 2014
 */
public class Pensioenregeling{
    public Pensioenregeling(){
    }
    
    /**
     * Bereken het pensioen op basis van de gegeven leeftijd.
     * Het tweede argument: true voor man, false voor vrouw.
     */
    public int geefPensioen(int leeftijd, boolean geslacht){
        // vul deze code aan    
        if (leeftijd <= 60)
            return 0;
        else if (leeftijd <= 65)
            return geslacht ? 0 : 45;
        else if (leeftijd <= 70)
            return geslacht ? 50 : 70;
        return 70;
    }
}
