import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Glijder extends Elementaal
{
    private static Random RG = new Random ();
    
    public Glijder () {
        super ();
    }

    public void act()
    {
        if (getObjectsInRange (50, null).size() > 0) {
            keerOm();
            vervangDoor(new Terugtrekker (RG.nextInt (40) + 40));
        } else if (isAtEdge()) {            
            keerOm();
            vervangDoor(new Wachter (RG.nextInt (100)));
        } else {
            glijd();
        }
    }
}
