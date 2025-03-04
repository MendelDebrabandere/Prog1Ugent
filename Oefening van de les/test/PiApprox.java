import java.util.Random;

public class PiApprox
{
    private int aantal_in_cirkel;

    private Random RG;
    
    public PiApprox()
    {
        RG = new Random();
    }

    public double GeefApprox()
    {
        int aantalInCirkel = 0;
        
        for (int i = 0 ; i < 1000000; ++i)
        {
            double randX = RG.nextDouble(1);
            double randY = RG.nextDouble(1);
            
            if (randX * randX + randY * randY < 1)
                ++aantalInCirkel;
        }
        
        return aantalInCirkel / 1000000.0 * 4;
        
    }
}
