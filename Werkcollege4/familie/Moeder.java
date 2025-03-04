
/**
 * Write a description of class Moeder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Moeder
{
    // instance variables - replace the example below with your own
    private Grootmoeder grootmoeder;
    private Kind dochter;

    /**
     * Constructor for objects of class Moeder
     */
    public Moeder(Grootmoeder gm)
    {
        grootmoeder = gm;
        dochter = new Kind(this);
    }

    public String geefFamilienaam()
    {
        return grootmoeder.geefFamilienaam();
    }
    
    public Kind geefDochter()
    {
        return dochter;
    }
}
