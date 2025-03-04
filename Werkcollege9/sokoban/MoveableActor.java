import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class MoveableActor extends Actor
{
    public enum MoveDir {
        UP(270),
        RIGHT(0),
        DOWN(90),
        LEFT(180);
        
        private int rot;

        MoveDir(int rot) {
            this.rot = rot;
        }

        public int getRot() {
            return rot;
        }
    }
    
    private int moveTicks;
    private MoveDir currMoveDir;
    
    private boolean canPush;
    private boolean isPushable;
    private boolean rotateWithMovement;
    
    public MoveableActor(boolean canPush, boolean isPushable, boolean rotateWithMovement)
    {
        this.canPush = canPush;
        this.isPushable = isPushable;
        this.rotateWithMovement = rotateWithMovement;
        moveTicks = 0;
    }
    
    public boolean getIsPushable()
    {
        return isPushable;
    }
    
    public boolean moveObj(MoveDir dir)
    {       
        // dont move when already moving
        if (moveTicks > 0)
            return false;
        
        // get XY moving direction from dir
        int X = 0;
        int Y = 0;
        switch (dir)
        {
            case UP:
                Y = -4;
                break;
            case RIGHT:
                X = 4;
                break;
            case DOWN:
                Y = 4;
                break;
            case LEFT:
                X = -4;
                break;
        }
        
        List<ImmoveableActor> listImmoveable = getObjectsAtOffset(X, Y, ImmoveableActor.class);
        List<MoveableActor> listMoveable = getObjectsAtOffset(X, Y, MoveableActor.class);
        
        boolean canMove = false;
        
        if (listImmoveable.isEmpty())
        {
            if (listMoveable.isEmpty())
            {
                canMove = true;
            }
            else if (listMoveable.get(0).getIsPushable() && canPush)
            {
                // if you managed to push the object in front of you
                if (listMoveable.get(0).moveObj(dir))
                {
                    canMove = true;
                }
            }

        }
        

        // set moving
        if (canMove)
        {
            moveTicks = 4;
            currMoveDir = dir;
            if (rotateWithMovement)
                setRotation(dir.getRot());
        }
        
        return canMove;
    }
    
    public void act()
    {
        if (moveTicks > 0)
        {
            // move
            moveTicks--;
            switch (currMoveDir)
            {
                case UP:
                    setLocation(getX(), getY()-1);
                    break;
                case RIGHT:
                    setLocation(getX()+1, getY());
                    break;
                case DOWN:
                    setLocation(getX(), getY()+1);
                    break;
                case LEFT:
                    setLocation(getX()-1, getY());
                    break;
            }
            // finished moving
            if (moveTicks <= 0)
                onMoved();
        }
    }
    
    public void onMoved()
    {
        return;
    }
}
