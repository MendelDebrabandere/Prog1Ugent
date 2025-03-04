import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Grot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grot extends World
{

    private int currTimerTime;
    final private int maxTimerTime = 50;
    final private int minTimerTime = 20;
    
    static final private Random RG = new Random();
    
    public Grot()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Greenfoot.setSpeed(35);
        
        addObject(new Vleermuis(), 300, 200);
        
        currTimerTime = 0;
    }
    
    public void act()
    {
        currTimerTime--;
        
        if (currTimerTime <= 0)
        {
            currTimerTime = RG.nextInt(minTimerTime, maxTimerTime);
            
            Stekel stekel1 = new Stekel();
            Stekel stekel2 = new Stekel();
            
            int scaleDiff = RG.nextInt(101) - 50;
            int width = stekel1.getImage().getWidth();
            int height = stekel1.getImage().getHeight();
            
            stekel1.getImage().scale(width, (int)(height * (100.0 + scaleDiff)/100.0));
            stekel2.getImage().scale(width, (int)(height * (100.0 - scaleDiff)/100.0));
            
            addObject(stekel1, 550, 5); 
            addObject(stekel2, 550, 395); 
        }
    }
}
