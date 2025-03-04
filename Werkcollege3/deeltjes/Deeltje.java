import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Deeltje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deeltje extends Actor
{
    private Vector location;
    private Vector velocity;
    
    private boolean firstAct;
    
    private boolean lading;
    
    public Deeltje(boolean lading)
    {
        this.lading = lading;
        if (lading)
            setImage("red-ball.png");
        else
            setImage("green-ball.png");
        
        
        firstAct = true;
        location = new Vector(0,0);
        velocity = new Vector(0,0);
    }
    
    /**
     * Act - do whatever the Deeltje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (firstAct)
        {
            firstAct = false;
            location = new Vector(getX(), getY()); 
        }
        
        velocity.add(computeForce());
        //if (velocity.norm() > 5)
        //    velocity.scaleToNorm(5);
        
        
        location.add(velocity);
        
        setLocation(location.getIntX(), location.getIntY());
    }
    
    private Vector computeForce()
    {
        Vector force = new Vector(0,0);
        
        List<Deeltje> alleDeeltjes = getWorld().getObjects(Deeltje.class);
        for (Deeltje other : alleDeeltjes)
        {
            if (other != this)
            {
                Vector direction = other.getPreciseLocation().minus(location);
                Double directionLength = direction.norm();
                direction.scaleToNorm(1);
                
                double size = 400 / (directionLength * directionLength);
                direction.scaleToNorm(size);
                
                if (other.getLading() == lading)
                    direction = (new Vector(0,0)).minus(direction);
                force.add(direction);
            }
        }
        
        if (force.norm() > 0.5)
            force.scaleToNorm(0.5);
        
        return force;
    }
    
    public Vector getPreciseLocation()
    {
        return location;
    }
    
    public boolean getLading()
    {
        return lading;
    }
}
