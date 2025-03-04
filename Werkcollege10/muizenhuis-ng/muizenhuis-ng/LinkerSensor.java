import greenfoot.*;

/**
 * Sensor die detecteert wanneer er een muis passeert.
 */
public class LinkerSensor extends Sensor
{
    
    public LinkerSensor(Deur deur, boolean isHorizontaal){
        super(deur, isHorizontaal);
    }
    
    public void sensorAan(){
        deur.linkerSensorAan();
    };
    
    public void sensorUit(){
        deur.linkerSensorUit();
    };
}
