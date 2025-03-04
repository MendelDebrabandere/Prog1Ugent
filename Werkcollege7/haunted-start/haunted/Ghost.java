import greenfoot.*;
import java.util.Random;
import java.util.ArrayList;

/**
 * Een spook dat door het kasteel dwaalt.
 */
public class Ghost extends Actor {

    private FloorMap map;
    private static final Random RG = new Random();
    
    private int movingDir;
    private int movedStepsSinceLocation;
    
    private int currX;
    private int currY;
    
    private boolean beginPlay;
    
    public Ghost(FloorMap map) {
        this.map = map;
        movingDir = RG.nextInt(4);
        beginPlay = false;
        movingDir = 0;
    }
    
    /**
     * Bij elk kruispunt kan het spook een andere (willekeurige) richting nemen. 
     * Het spook keert echter enkel op zijn stappen terug als het niet anders kan.
     */
    public void act() {
        if (!beginPlay) {
            beginPlay = true;
            recalculatePosition();
            calculateNextDir();
        }
        
        if (movedStepsSinceLocation >= 4) {
            recalculatePosition();
            calculateNextDir();
        }
        
        move();
    }    
    
    private void calculateNextDir() {
        ArrayList<Integer> directions = new ArrayList<>();
        
        for (int i = 0; i < 4; ++i) {
            if (map.canMove(currY, currX, i)) {
                directions.add(i);
            }
        }
        
        if (directions.size() != 1) { // if there are options that are not going back
            directions.remove(new Integer((movingDir + 2) % 4)); //remove the going back option
        }
        
        movingDir = directions.get(RG.nextInt(directions.size()));
    }
    
    private void recalculatePosition() {
        currX = (getX() - 2) / 4;
        currY = (getY() - 2) / 4;
        movedStepsSinceLocation = 0;
    }
    
    private void move() {
        //move
        int[] rowAdd = {0, 1, 0, -1};
        int[] columnAdd = {1, 0, -1, 0};
        
        setLocation(getX() + columnAdd[movingDir], getY() + rowAdd[movingDir]);
        ++movedStepsSinceLocation;
        
        //swap image
        String imageName = getImage().toString();
        
        int currImageIdx = imageName.charAt(24) % 2;
        int newImageIdx = movingDir * 2 + (currImageIdx == 1 ? 0 : 1);
        
        String newImageName = imageName.substring(17, 24) + newImageIdx + imageName.substring(25, 29);
        
        setImage(newImageName);
        
    }
    
}
