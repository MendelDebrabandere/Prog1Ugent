import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Stelt één component van de rups voor.
 * Een component beweegt in een bepaalde richting.
 */
public class RupsComponent extends Actor
{
    protected int richting;
    
    public RupsComponent(int x, int y, int richting) {
        setLocation(x, y);
        this.richting = richting;
    }     
    
    public void act()
    {
        setLocation(normalizeerX(getX()+Richting.getDeltaX(richting)),
                    normalizeerY(getY()+Richting.getDeltaY(richting)));
    }
    
    public int normalizeerX(int x) {
        if (x < 0) {
            return x + Speelveld.BREEDTE;
        } else if (x >= Speelveld.BREEDTE) {
            return x - Speelveld.BREEDTE;
        } else {
            return x;
        }
    }
    
    public int normalizeerY(int y) {
        if (y < 0) {
            return y + Speelveld.HOOGTE;
        } else if (y >= Speelveld.HOOGTE) {
            return y - Speelveld.HOOGTE;
        } else {
            return y;
        }
    }    
}
