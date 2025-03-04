import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Terugtrekker extends Actor
{
    private static final Random RG = new Random();
    
    private int richting;
    private int wachtTicks;
    
    public Terugtrekker () {
        this.richting = 0; // van west naar oost
        wachtTicks = RG.nextInt(40) + 40;
    }
    
    private void keerOm () {
        richting = (richting + 180) % 360;
    }
    
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
        glijd();
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

