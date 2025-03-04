import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Simulatie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulatie extends World
{

    /**
     * Constructor for objects of class Simulatie.
     * 
     */
    public Simulatie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new Deeltje(true), 100, 300);
        addObject(new Deeltje(true), 200, 200);
        addObject(new Deeltje(false), 500, 150);
        addObject(new Deeltje(false), 300, 350);
    }
}
