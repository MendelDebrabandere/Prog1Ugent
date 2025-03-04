
import java.util.List;

public class VerbodenTekenopschoner implements Helper
{
    
    private List<Character> verbodenTekens;
    
    VerbodenTekenopschoner(List<Character> verbodenTekens)
    {
        this.verbodenTekens = verbodenTekens;
    }
    
    public String verwerk (String invoer)
    {
        String returnStr = new String(invoer);
        for (Character ch : verbodenTekens)
        {
            returnStr = returnStr.replace(ch.toString(), "");
        }        
        return returnStr;
    }
}
