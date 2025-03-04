
/**
 * Write a description of class BinaryCounter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryCounter
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BinaryCounter
     */
    public BinaryCounter()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int getal)
    {
        int returnVal = 0;
        
        while (getal != 0)
        {
            returnVal += getal % 2;
            getal /= 2;
        }
        
        return returnVal;
    }
    
    
    public int aantalAs(String str)
    {
        int idx = 0;
        int aantal = 0;
        while (idx != -1)
        {
            idx = str.indexOf('a',idx+1);
            if (idx != -1)
                ++aantal;
        }
        
        return aantal;
    }
    
}
