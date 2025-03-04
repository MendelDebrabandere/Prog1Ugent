import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puls extends Actor
{
    private Schaakklok sklok;
    
    public Puls (Schaakklok sklok) {
        this.sklok = sklok;
    }
    
    public void act() 
    {
        sklok.ontvangPuls();
    }    
}
