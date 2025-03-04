
/**
 * Write a description of class VerplichtTekencontroleur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VerplichtTekencontroleur implements Helper
{

    private char teken;
    
    public VerplichtTekencontroleur(char verplichtTeken)
    {
        teken = verplichtTeken;
    }
    
    public String verwerk (String invoer)
    {
        if (invoer.indexOf(teken) != -1)
        {
            return invoer;
        }
        return null;
    }
}
