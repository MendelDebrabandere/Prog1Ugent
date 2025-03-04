
/**
 * Write a description of class Grootmoeder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grootmoeder
{
    // instance variables - replace the example below with your own
    private String familienaam;
    private Moeder dochter;

    /**
     * Constructor for objects of class Grootmoeder
     */
    public Grootmoeder(String familienaam)
    {
        this.familienaam = familienaam;
        dochter = new Moeder(this);
    }

    public String geefFamilienaam()
    {
        return familienaam;
    }
    
    public Moeder geefDochter()
    {
        return dochter;
    }
    
    public Kind geefKleindochter()
    {
        return dochter.geefDochter();
    }
}
