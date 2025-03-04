import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In dit kasteel dwalen er twee spoken rond...
 */
public class Castle extends World {  

    /**
     * Constructor for objects of class Castle.     * 
     */
    public Castle() {    
        // Opgelet: de cellen zijn 8x8 maar de muurdelen zijn 32x32!
        super(57, 57, 8); 
        Greenfoot.setSpeed(36);

        // Plaats de muren en de spoken op de wereld, zoals in de
        // plattegrond
        FloorMap map = new FloorMap();
        
        for (int row = 0; row < 14; ++row) {
            for (int column = 0; column < 14; ++column) {
                if (map.isWall(row, column)) {
                    addObject(new Wall(), 2 + column * 4, 2 + row * 4);
                }
                else if (map.isStartPosition(row, column)) {
                    Ghost ghost = new Ghost(map);
                    addObject(ghost, 2 + column * 4, 2 + row * 4);
                }
            }
        }
        
        
    }
}
