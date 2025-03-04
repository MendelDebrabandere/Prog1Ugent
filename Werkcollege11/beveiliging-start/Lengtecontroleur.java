
/**
 * Write a description of class Lengtecontroleur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lengtecontroleur implements Helper
{
    private int min;
    private int max;    

    public Lengtecontroleur(int minimum, int maximum)
    {
        min = minimum;
        max = maximum;
    }
    
    public String verwerk (String invoer)
    {
        if (invoer.length() < max && invoer.length() > min)
        {
            return invoer;
        }
        return null;
    }
}
