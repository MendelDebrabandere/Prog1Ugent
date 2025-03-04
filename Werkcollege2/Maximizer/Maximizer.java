
/**
 * Write a description of class Maximizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maximizer
{
    // instance variables - replace the example below with your own
    private int max;
    private boolean hasReceivedValue;

    /**
     * Constructor for objects of class Maximizer
     */
    public Maximizer()
    {
        // initialise instance variables
        max = 0;
        hasReceivedValue = false;
    }

    public void AddValue(int val)
    {
        if (val > max || !hasReceivedValue)
        {
            max = val;
            hasReceivedValue = true;
        }         
    }
    
    public int GetMaxValue()
    {
        return max;
    }
}
