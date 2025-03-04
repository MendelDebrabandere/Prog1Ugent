import greenfoot.*;


public class Lamp extends Actor {
    
    private boolean aan = false;
    
    public Lamp(boolean aan) {
        this.aan = aan;
        this.setImage(aan ? "lamp-aan.png" : "lamp-uit.png");
    }
    
    public void toggleLamp(boolean aan) {
        if (this.aan != aan) {
            this.aan = aan;
            this.setImage(aan ? "lamp-aan.png" : "lamp-uit.png");
        }
    }
}
