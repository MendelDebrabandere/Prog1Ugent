import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Elementaal extends Actor
{
    private static Random RG = new Random ();

    private int richting;

    public Elementaal () {
        this.richting = 0;
    }
    
    public void keerOm () {
        richting = (richting + 180) % 360;
    }
    
    /**
     * Beweeg zonder de orientatie van de prent aan te passen
     */
    public void glijd () {
        setRotation(richting);
        move(1);
        setRotation(0);
    }

    public void setRichting (int richting) {
        this.richting = richting;
    }

    public void vervangDoor (Elementaal actor) {
        actor.setImage(getImage());
        actor.setRichting(richting);
        getWorld().addObject(actor, getX(), getY());
        getWorld().removeObject(this);
    }

}
