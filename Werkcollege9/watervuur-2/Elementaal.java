import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Elementaal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elementaal extends Actor
{
    
    private static Random RG = new Random ();
    private int richting;
    private int leeftijd;
    
    public Random getRand()
    {
        return RG;
    }
    
    public void verminderLeeftijd()
    {
        leeftijd--;
    }
    
    public Elementaal(int leeftijd)
    {
        this.richting = 0;
        this.leeftijd = leeftijd;
    }
    
    public boolean isLeeftijdNul()
    {
        return leeftijd == 0;
    }
    
    public int getRichting()
    {
        return richting;
    }
    
    public void keerOm()
    {
        richting = (richting + 180) % 360;
    }
    
    public void glijd () {
        setRotation(richting);
        move(1);
        setRotation(0);
    }
    
    public void setRichting (int richting) {
        this.richting = richting;
    }
    
    public void vervangDoor (Actor actor) {
        actor.setImage(getImage());
        getWorld().addObject(actor, getX(), getY());
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
