
public class Boot
{
    private int xCoord;
    private int yCoord;
    private boolean horizontal;
    private int length;

    public Boot(int xCoord, int yCoord, boolean horizontal, int length)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.horizontal = horizontal;
        this.length = length - 1;
    }
    
    public boolean isRaak(int xHit, int yHit)
    {
        if (xHit == xCoord && !horizontal)
        {
            if (yHit >= yCoord && yHit <= yCoord + length)
                return true;
        }
        else if (yHit == yCoord && horizontal)
        {
            if (xHit >= xCoord && xHit <= xCoord + length)
                return true;
        }
        return false;
    }
    
    public boolean overlapBoot(Boot other)
    {
        for (int i=0; i <= length; ++i)
        {
            int newX = xCoord + (horizontal ? i : 0);
            int newY = yCoord + (horizontal ? i : 0);
            
            if (other.isRaak(xCoord, yCoord))
                return true;
        }
        return false;
    }
    
    public boolean pastInZee(int xZee, int yZee)
    {
        if (xCoord < 0 || yCoord < 0)
            return false;
            
        if (horizontal)
            if (xCoord + length > xZee)
                return false;
        else if (yCoord + length > yZee)
            return false;
            
        return true;
        
    }
}
