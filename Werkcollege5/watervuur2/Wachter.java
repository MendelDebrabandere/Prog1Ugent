import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Wachter extends Actor
{
    private static final Random RG = new Random();
    
    private int richting;
    private int wachtTicks;
    
    public Wachter () {
        this.richting = 0; // van west naar oost
        wachtTicks = wachtTicks = RG.nextInt(100);;
    }
    
    private void keerOm () {
        richting = (richting + 180) % 360;
    }
    
    /**
     * Beweeg zonder de orientatie van de prent aan te passen
     */
    private void glijd () {
        setRotation(richting);
        move(1);
        setRotation(0);
    }

    public void setRichting (int richting) {
        this.richting = richting;
    }

    public void act()
    {
        --wachtTicks;
        if (wachtTicks <= 0) {
            keerOm();
            Glijder nieuw = new Glijder();
            vervangDoor(nieuw);
            nieuw.setRichting(richting);
        }
    }   
    
    public void vervangDoor (Actor actor) {
        actor.setImage(getImage());
        getWorld().addObject(actor, getX(), getY());
        getWorld().removeObject(this);
    }
}

