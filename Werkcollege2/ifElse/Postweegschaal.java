/**
 * Oefening Programmeren
 * 
 * @author Benoit Desouter et al. 
 * @version oktober 2014
 */
public class Postweegschaal{
    
    public Postweegschaal(){
    }

    /**
     * Bereken de prijs voor een postpakket met het opgegeven gewicht.
     */
    public int geefPrijs(int gewicht){
          //vul deze code aan      
        if(gewicht <=2)
            return 18;
        else 
            gewicht -= 2;
            return 18 + 5 * gewicht;
    }
}
