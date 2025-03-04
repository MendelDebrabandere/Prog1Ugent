import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lampje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lampje extends Actor
{
    private Schaakklok sklok;
    
    private int speler;
    
    public Lampje (Schaakklok sklok, int speler) {
        this.sklok = sklok;
        this.speler = speler;
    }
    
    public void act() {
        if (sklok.welkLampje() == speler) {
            setImage("licht-rood.png");
        } else {
            setImage("licht-wit.png");
        }
    }
}
