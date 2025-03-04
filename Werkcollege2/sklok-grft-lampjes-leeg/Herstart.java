import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Herstart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Herstart extends Actor
{
    
    private Schaakklok sklok;
    
    public Herstart (Schaakklok sklok) {
        this.sklok = sklok;
    }
    
    public void act() {
        /*
        if (Greenfoot.mousePressed(this)) {
            this.setLocation(getX() + 2, getY() + 2);
        } else if (Greenfoot.mouseClicked(this)) {
            this.setLocation(getX() - 2, getY() - 2);
            sklok.herstart();
        }
        */
        if (Greenfoot.mouseClicked(this)) {
            sklok.herstart();
        }
    }    
}
