import greenfoot.*;

/**
 * Sensor die detecteert wanneer er een muis passeert.
 */
public class Sensor extends Actor {
    
    private Deur deur;
    private boolean isLinks;
    private boolean isHorizontaal;
    
    private boolean touchingMuis;
    
    public Sensor(Deur deur, boolean isLinks, boolean isHorizontaal){
        this.deur = deur;
        this.isLinks = isLinks;
        this.isHorizontaal = isHorizontaal;
        
        touchingMuis = false;
    }
    
    public void act() 
    {
        if (isTouching(Muis.class)) {
            if (!touchingMuis) {
                touchingMuis = true;
                setImage(isHorizontaal ? "sensor-aan-horizontaal.png" : "sensor-aan-verticaal.png");
                if (isLinks) deur.linkerSensorAan();
                else deur.rechterSensorAan();
            }
        }
        else {
            if (touchingMuis) {
                touchingMuis = false;
                setImage(isHorizontaal ? "sensor-uit-horizontaal.png" : "sensor-uit-verticaal.png");
                if (isLinks) deur.linkerSensorUit();
                else deur.rechterSensorUit();
            }
        }
    }
}
