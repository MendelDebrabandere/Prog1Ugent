
import java.util.ArrayList;
/**
 * Write a description of class Cafe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cafe
{
    // instance variables - replace the example below with your own
    private ArrayList<Bier> bieren;

    /**
     * Constructor for objects of class Cafe
     */
    public Cafe()
    {
        bieren = new ArrayList<>();
    }

    public void voegBierToe(Bier bier)
    {
        bieren.add(bier);
    }
    
    public void drankLijst()
    {
        for (Bier bier : bieren)
        {
            bier.printBier();
        }
    }
    
    public void beperkteLijst(String startletter)
    {
        for (Bier bier : bieren)
        {
            if (bier.getNaam().substring(0,1).equals(startletter))
            {
                bier.printBier();
            }
        }
    }
    
    public void zwareBieren(double alcoholpercentage)
    {
        for (Bier bier : bieren)
        {
            if (bier.getPercentage() >= alcoholpercentage)
            {
                bier.printBier();
            }
        }
    }
    
    public void stadsbier(String stad)
    {
        for (Bier bier : bieren)
        {
            if (bier.getStad().equals(stad))
            {
                bier.printBier();
            }
        }
    }
}
