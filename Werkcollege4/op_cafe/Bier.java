
/**
 * Write a description of class Bier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bier
{
    // instance variables - replace the example below with your own
    private String naam;
    private double percentage;
    private String stad;

    /**
     * Constructor for objects of class Bier
     */
    public Bier(String naam, double percentage, String stad)
    {
        this.naam = naam;
        this.percentage = percentage;
        this.stad = stad;
    }
    
    public void printBier()
    {
        System.out.println("Naam: " + naam);
        System.out.println("Alcoholpercentage: " + percentage);
        System.out.println("Stad van oorsprong: " + stad);
        System.out.println(" ");
    }
    
    public String getNaam()
    {
        return naam;
    }
    
    public double getPercentage()
    {
        return percentage;
    }
    
    public String getStad()
    {
        return stad;
    }
}
