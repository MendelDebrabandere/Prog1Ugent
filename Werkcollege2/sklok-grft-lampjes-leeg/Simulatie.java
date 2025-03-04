import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 */
public class Simulatie extends World {

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Simulatie()
    {    
        super(470, 320, 1); 
        
        Greenfoot.setSpeed(25);
        
        Schaakklok sklok = new Schaakklok ();
        sklok.herstart();
        
        addObject(new Herstart(sklok), 424, 40);
        addObject(new Knop(sklok), 38, 40);
        addObject(new Puls(sklok), 38, 148);
        addObject(new Stop(sklok), 305, 40);
        addObject(new Display(sklok,1), 208, 270);
        addObject(new Display(sklok,2), 316, 270);
        addObject(new Lampje(sklok,1), 240, 234);
        addObject(new Lampje(sklok,2), 284, 234);
    }
}
