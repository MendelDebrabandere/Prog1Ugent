import greenfoot.*;

/**
 * Sensor die detecteert wanneer er een muis passeert.
 */
public class Sensor extends Actor
{
    protected Deur deur;
    private String sensorAanAfbeelding;
    private String sensorUitAfbeelding;
    
    public Sensor(Deur deur, boolean isHorizontaal){
        this.deur = deur;
        if (isHorizontaal) {
           sensorAanAfbeelding = "sensor-aan-horizontaal.png";
           sensorUitAfbeelding = "sensor-uit-horizontaal.png";
        } else {
           sensorAanAfbeelding = "sensor-aan-verticaal.png";
           sensorUitAfbeelding = "sensor-uit-verticaal.png";
        }
    }
    
    /**
     * Sensor gaat aan als er een muis die aanraakt.
     */
    public void act() 
    {
        if(isTouching(Muis.class)){
            setImage(sensorAanAfbeelding);
            sensorAan();
        } else {
            setImage(sensorUitAfbeelding);
            sensorUit();
        }
    } 
    
    public void sensorAan(){
        System.out.println("sensorAan() werd opgeroepen in Sensor");
    };
    
    public void sensorUit(){
        System.out.println("sensorUit() werd opgeroepen in Sensor");
    };
    
    @Override
    public void addedToWorld(World world) {
        setImage(sensorUitAfbeelding);
    }
}
