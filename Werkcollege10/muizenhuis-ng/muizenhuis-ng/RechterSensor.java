import greenfoot.*;

/**
 * Sensor die detecteert wanneer er een muis passeert.
 */
public class RechterSensor extends Sensor
{
    
    public RechterSensor(Deur deur, boolean isHorizontaal){
        super(deur, isHorizontaal);
    }

    public void sensorAan(){
        deur.rechterSensorAan();
    };
    
    public void sensorUit(){
        deur.rechterSensorUit();
    };
}
