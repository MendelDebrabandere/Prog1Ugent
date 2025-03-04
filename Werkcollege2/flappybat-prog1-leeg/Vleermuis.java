import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vleermuis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vleermuis extends Actor
{
    /**
     * Act - do whatever the Vleermuis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int valSnelheid;
    
    public Vleermuis()
    {
        valSnelheid = 0;
    }
    
    public void act()
    {
        if ("space".equals(Greenfoot.getKey()))
            stijg(); 
        else
            val();
        
        hitDetection(); 
    }
    
    private void stijg()
    {
        setImage ("vleermuis1.png");
        setLocation(getX(), getY() - 15); 
        valSnelheid = 0;
    }
    
    private void val()
    {
        setImage ("vleermuis2.png");
        valSnelheid += 5;
        setLocation(getX(), getY() + valSnelheid);
    }
    
    private void hitDetection()
    {
        if (isTouching(Stekel.class) || isAtEdge())
            sterf();
    }
    
    private void sterf()
    {
        getWorld().addObject(new DodeVleermuis(), getX(), getY());
        getWorld().removeObject(this);
    }
}
