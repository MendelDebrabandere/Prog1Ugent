import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stuk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Stuk extends Actor
{
    protected Stuk (int index, boolean wit) {
        setImage ("stuk-"+(wit ? index : index + 6) +".png");
    }
}
