import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oefeningen op de for-lus.
 */
public class Schaakbord extends World
{

    /**
     * Constructor
     */
    public Schaakbord()
    {   
        // 8 x 8 cellen van 45 x 45 pixels
        super(8, 8, 45); 
        
        // hier aanvullen...
        
        //patroonA();
        //patroonB();
        //patroonC();
        //patroonD();
        //patroonE();
        patroonF();
    }
    
    private void patroonA()
    {
        for (int i = 0 ; i < 8 ; ++i)
        {
            addObject(new Toren(true), 0, i);
        }
    }
    private void patroonB()
    {
        for (int i = 1 ; i < 7 ; ++i)
        {
            addObject(new Pion(false), i, 4);
        }
    }
    private void patroonC()
    {
        for (int i = 0 ; i < 8 ; ++i)
        {
            addObject(new Loper(false), i, 7-i);
        }
    }
    private void patroonD()
    {
        for (int i = 0 ; i < 4 ; ++i)
        {
            addObject(new Paard(true), 2*i, 2);
        }
    }
    private void patroonE()
    {
        for (int i = 0 ; i < 8 ; ++i)
        {
            addObject((i%2 == 0) ? new Toren(false) : new Dame(true), i, 6);
        }
    }
    private void patroonF()
    {
        for (int i = 1 ; i < 7 ; ++i)
        {
            addObject(new Dame(false), i, 0);
            addObject(new Dame(false), i, 7);
        }
        for (int i = 0 ; i < 8 ; ++i)
        {
            addObject(new Dame(false), 0, i);
            addObject(new Dame(false), 7, i);
        }
    }
}
