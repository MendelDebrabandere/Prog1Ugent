
/**
 * Write a description of class Kind here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kind
{
    // instance variables - replace the example below with your own
    private Moeder mama;

    /**
     * Constructor for objects of class Kind
     */
    public Kind(Moeder m)
    {
        mama = m; // initialise instance variables
    }

    public String geefFamilienaam()
    {
        return mama.geefFamilienaam();
    }
}
