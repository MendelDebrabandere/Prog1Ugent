import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stekel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stekel extends Actor
{
    /**
     * Act - do whatever the Stekel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        
        if (getX() <= 0)
            getWorld().removeObject(this);
            //Greenfoot.stop();
    }
    
    private void move()
    {
        setLocation(getX() - 7, getY());
    }
}
