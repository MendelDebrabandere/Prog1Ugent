import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grot extends World
{

    /**
     * Constructor for objects of class Grot.
     * 
     */
    public Grot()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Greenfoot.setSpeed(35);
        
        addObject(new Vleermuis(), 300, 200);
        
        //addObject(new DodeVleermuis(), 300, 200);
        //addObject(new DodeVleermuis(), 100, 100);
        //addObject(new DodeVleermuis(), 500, 50);
        //addObject(new DodeVleermuis(), 200, 75);
        //addObject(new DodeVleermuis(), 450, 340);
        //addObject(new DodeVleermuis(), 125, 300);
        
        addObject(new Stekel(), 550, 5); 
        addObject(new Stekel(), 550, 395); 
    }
}
