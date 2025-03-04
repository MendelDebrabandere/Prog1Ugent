
/**
 * Write a description of class BiMaximizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BiMaximizer
{
    // instance variables - replace the example below with your own
    private Maximizer x;
    private Maximizer y;
    
    /**
     * Constructor for objects of class BiMaximizer
     */
    public BiMaximizer()
    {
        // initialise instance variables
        x = new Maximizer();
        y = new Maximizer();
    }

    public void AddCoordinate(int xNum, int yNum)
    {
        x.AddValue(xNum);
        y.AddValue(yNum);
    }
    
    public int GetLargestX()
    {
        return x.GetMaxValue();
    }
    
    public int GetLargestY()
    {
        return y.GetMaxValue();
    }
}
