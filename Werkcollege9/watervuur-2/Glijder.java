import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Glijder extends Elementaal
{
    public Glijder () {
        super(0);
    }

    public void act()
    {
        if (getObjectsInRange (50, null).size() > 0) {
            keerOm();
            Terugtrekker terug = new Terugtrekker (getRand().nextInt (40) + 40);
            terug.setRichting(getRichting());
            vervangDoor(terug);
        } else if (isAtEdge()) {            
            keerOm();
            Wachter wachter = new Wachter (getRand().nextInt (100));
            wachter.setRichting(getRichting());
            vervangDoor(wachter);
        } else {
            glijd();
        }
    }
}
