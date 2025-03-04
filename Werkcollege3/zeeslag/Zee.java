import java.util.ArrayList;

public class Zee
{
    private int xSize;
    private int ySize;
    
    private ArrayList<Boot> boten;

    public Zee(int xSize, int ySize)
    {
        this.xSize = xSize;
        this.ySize = ySize;
        boten = new ArrayList<Boot>();
    }
    
    public int aantalBoten()
    {
        return boten.size();
    }
    
    public boolean isRaak(int x, int y)
    {
        for (Boot boot : boten)
        {
            if (boot.isRaak(x, y))
                return true;
        }
        return false;
    }
    
    public boolean overlaptBoot(Boot checkBoot)
    {
        for (Boot boot : boten)
        {
            if (checkBoot.overlapBoot(boot))
                return true;
        }
        return false;
    }
    
    public boolean pastInZee(Boot checkBoot)
    {
        return checkBoot.pastInZee(xSize, ySize);
    }
    
    public void voegBootToe(Boot boot)
    {
        if (!overlaptBoot(boot) && pastInZee(boot) && !boten.contains(boot))
        {
            boten.add(boot);
        }
    }
    
}
