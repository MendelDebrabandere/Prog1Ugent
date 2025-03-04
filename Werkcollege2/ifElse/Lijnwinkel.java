/**
 * Oefening Programmeren.
 * 
 * @author Benoit Desouter et al.
 * @version oktober 2014
 */
public class Lijnwinkel{

    public Lijnwinkel(){
    }

    
    /**
     * Bereken de totale kostprijs van de kaartjes.
     */
    public int geefKostprijs(int aantal){
        // vul deze code aan
        if (aantal < 5)
            return aantal * 5;
        else if (aantal <10)
            return aantal * 4;
        else
            return aantal * 3;
    }
}
