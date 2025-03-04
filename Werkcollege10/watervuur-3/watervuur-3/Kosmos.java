import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kosmos extends World
{

    public Kosmos()
    {    
        super(400, 400, 1);
        Glijder vuur = new Glijder ();
        GreenfootImage image = new GreenfootImage ("vuur.png");
        image.scale(48,48);
        vuur.setImage (image);
        vuur.setRichting (90);
        
        Glijder water = new Glijder ();
        image = new GreenfootImage ("water.png");
        image.scale(48,48);
        water.setImage (image);
        
        addObject(vuur, 200, 1); // niet meteen 'atEdge'
        addObject(water, 1, 200);
        
        Greenfoot.setSpeed(55);
    }
}
