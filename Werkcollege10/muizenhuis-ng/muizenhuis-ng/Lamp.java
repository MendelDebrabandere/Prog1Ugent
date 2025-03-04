import greenfoot.*;

/**
 * Een lamp is ofwel aan of uit.
 */
public class Lamp extends Actor
{
    public Lamp(boolean aan) {
        if (aan) {
            setImage("lamp-aan.png");
        } else {
            setImage("lamp-uit.png");
        }
    }

    public void aan() {
        setImage("lamp-aan.png");
    }
    
    public void uit() {
        setImage("lamp-uit.png");
    }
}
