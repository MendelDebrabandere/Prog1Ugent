import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vloer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vloer extends World
{
    //14 x 10
    private static final String[] KAART = {
        "OOOOOOOOOOOO  ",
        "O..  O     OOO",
        "O..  O x  x  O",
        "O..  OxOOOO  O",
        "O..    s OO  O",
        "O..  O O  x OO",
        "OOOOOO OOx x O",
        "  O x  x x x O",
        "  O    O     O",
        "  OOOOOOOOOOOO" 
    };

    //12 x 11
    //private static final String[] KAART = {
    //    "OOOOOO  OOO ",
    //    "O..  O OOsOO",
    //    "O..  OOO   O",
    //    "O..     xx O",
    //    "O..  O O x O",
    //    "O..OOO O x O",
    //    "OOOO x Ox  O",
    //    "   O  xO x O",
    //    "   O x  x  O",
    //    "   O  OO   O",
    //    "   OOOOOOOOO" 
    //};

    /**
     * Constructor for objects of class Vloer.
     * 
     */
    public Vloer()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(58, 42, 8); 
        setPaintOrder (Bulldozer.class, Kist.class, Doel.class, Muur.class);
        Greenfoot.setSpeed(35);
        
        // init map met de data
        for (int arrIdx = 0; arrIdx < 10; arrIdx++)
        {
            for (int strIdx = 0; strIdx < 14; strIdx++)
            {
                char kaartChar = KAART[arrIdx].charAt(strIdx);
                int X = (int)((strIdx+0.5) * 4);
                int Y = (int)((arrIdx+0.5) * 4);
                if (kaartChar == 'O') {
                    addObject(new Muur(), X, Y);
                } else if (kaartChar == 'x') {
                    addObject(new Kist(), X, Y);
                } else if (kaartChar == '.') {
                    addObject(new Doel(), X, Y);
                } else if (kaartChar == 's') {
                    addObject(new Bulldozer(), X, Y);
                }
            }
        }
            
    }
}
