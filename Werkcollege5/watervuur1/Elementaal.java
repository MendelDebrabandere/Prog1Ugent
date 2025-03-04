import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Elementaal extends Actor
{
    private enum State {
        gliding,
        waiting,
        returning
    }
    
    private static final Random RG = new Random();
    
    private int richting;
    private int wachtTicks;
    private State state;
    
    public Elementaal () {
        this.richting = 0; // van west naar oost
        wachtTicks = 0;
        state = State.gliding;
    }
    
    private void keerOm () {
        richting = (richting + 180) % 360;
    }
    
    /**
     * Beweeg zonder de orientatie van de prent aan te passen
     */
    private void glijd () {
        setRotation(richting);
        move(1);
        setRotation(0);
    }

    public void setRichting (int richting) {
        this.richting = richting;
    }

    public void act()
    {
        switch (state){
            case gliding:
                glijd();
                if (isAtEdge() && wachtTicks == 0) {
                    wachtTicks = RG.nextInt(100);
                    state = State.waiting;
                }
                else if (getObjectsInRange(50,null).size() > 0) {
                    keerOm();
                    state = State.returning;
                    wachtTicks = RG.nextInt(40) + 40;
                }
                break;
           case waiting:
               --wachtTicks;
               if (wachtTicks <= 0) {
                   state = State.gliding;
                   keerOm();
                   glijd();
               }
               break;
           case returning:
               glijd();
               --wachtTicks;
               if (wachtTicks <= 0) {
                   state = State.gliding;
                   keerOm();
               }
        }
    }    
}

