import java.util.Random;

public class PuntPlaatser
{   
    private static final Random RG = new Random();
    
    private String s;
    
    public PuntPlaatser(String s)
    {
        this.s = s;
    }

    public String plaatsPunt()
    {
        int randPlaats = RG.nextInt(s.length());
        
        String subs1 = s.substring(0, randPlaats);
        String subs2 = s.substring(randPlaats, s.length());
        
        return subs1 + '.' + subs2;
    }
}
