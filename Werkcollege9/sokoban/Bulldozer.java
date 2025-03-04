import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulldozer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulldozer extends MoveableActor
{
    
    public Bulldozer()
    {
        super(true, true, true);
    }
    
    public void act()
    {
        super.act();
        
        if (Greenfoot.isKeyDown("w")) {
            moveObj(MoveDir.UP);
        } else if (Greenfoot.isKeyDown("d")) {
            moveObj(MoveDir.RIGHT);
        } else if (Greenfoot.isKeyDown("s")) {
            moveObj(MoveDir.DOWN);
        } else if (Greenfoot.isKeyDown("a")) {
            moveObj(MoveDir.LEFT);
        }
        
    }
}
