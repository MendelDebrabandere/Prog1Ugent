import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Kist extends MoveableActor
{

    private boolean isOnDoel;
    
    public Kist()
    {
        super(false, true, false);
        isOnDoel = false;
    }
    
    public void act()
    {
        super.act();
    }
    
    public void onMoved()
    {
        super.onMoved(); 
        
        // sta ik op een doel?
        List<Doel> listDoel = getIntersectingObjects(Doel.class);
        
        // zo ja, update naar kist donker
        if (!listDoel.isEmpty() && !isOnDoel)
        {
            isOnDoel = true;
            setImage("kist-donker.png");
        }
        else if (listDoel.isEmpty() && isOnDoel) // zo nee, update naar kist licht
        {
            isOnDoel = false;
            setImage("kist.png");
        }
        
        // ik gebruik hier een extra boolean zodat we niet constant setten naar kist.png
        // als we aan het verplaatsen zijn zonder een doel in de buurt  
    }
    
}
