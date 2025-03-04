import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Glijder extends Actor
{
    private static final Random RG = new Random();
    
    private int richting;
    
    public Glijder () {
        this.richting = 0; // van west naar oost
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

    public void act() {
        glijd();
        if (isAtEdge()) {
            Wachter nieuw = new Wachter();
            vervangDoor(nieuw);
            nieuw.setRichting(richting);
        }
        else if (getObjectsInRange(50,null).size() > 0) {
            keerOm();
            Terugtrekker nieuw = new Terugtrekker();
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

