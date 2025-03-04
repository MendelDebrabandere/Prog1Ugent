
public class Laser
{
    private int xWall;
    private int yWall;

    private int xHits;
    private int yHits;
    
    private int xPos;
    private int yPos;
    
    private boolean movingUp;
    private boolean movingRight;
    
    public Laser()
    {
        xWall = 0;
        yWall = 0;
        xHits = 0;
        yHits = 0;
        xPos = 0;
        yPos = 0;
        movingUp = true;
        movingRight = true;
    }

    public void setWalls(int x, int y)
    {
        xWall = x;
        yWall = y;
    }
    
    public void shoot()
    {
        boolean doubleHit = false;
        
        while (!doubleHit)
        {
            xPos += movingRight ? 1 : -1;
            yPos += movingUp ? 1 : -1;
            
            int hits = 0;
            if (xPos <= 0 || xPos >= xWall)
            {
                 movingRight = !movingRight;
                 xHits++;
                 hits++;
            }
            if (yPos <= 0 || yPos >= yWall)
            {
                movingUp = !movingUp;
                yHits++;
                hits++;
            }
            if (hits == 2)
            {
                doubleHit = true;
                hits -= 2; // dont count the double hit
            }
        }
    }
    
    public int getHits()
    {
        return xHits + yHits;
    }
    
    public int getHorHits()
    {
        return xHits;
    }
    
    public int getVerHits()
    {
        return yHits;
    }
}
