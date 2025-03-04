import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MetLeeftijd extends Elementaal
{
    private int leeftijd; // enkel gebruikt door Wachter en Terugtrekker
        
    public MetLeeftijd(int leeftijd)
    {
        super();
        this.leeftijd = leeftijd;
    }
    
    public void act()
    {
        if (leeftijd == 0) {
            actBijLeeftijdNul();
        } else {
            leeftijd --;
            actBijLeeftijdNietNul();
        }
    }
    
    public void actBijLeeftijdNul()
    {
        
    }
    
    public void actBijLeeftijdNietNul()
    {
        
    }
}
