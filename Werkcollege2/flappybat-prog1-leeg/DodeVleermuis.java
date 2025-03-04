import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DodeVleermuis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DodeVleermuis extends Actor
{
    /**
     * Act - do whatever the DodeVleermuis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int valSnelheid;
    
    public DodeVleermuis()
    {
        valSnelheid = 0;
    }
    
    public void act()
    {
        val();
        
        if (getY() >= 365)
            Greenfoot.stop();
    }
    
    private void val()
    {
        valSnelheid += 5;
        
        setLocation(getX(), getY() + valSnelheid);
    }
}
