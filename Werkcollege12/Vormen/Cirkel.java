
public class Cirkel implements Vorm
{
    private int r;
    
    public Cirkel(int straal)
    {
        r = straal;
    }

    public double oppervlakte()
    {
        return r*r*Math.PI;
    }
    
}
