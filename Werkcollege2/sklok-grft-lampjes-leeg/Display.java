import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Display extends Actor {
    
    private Schaakklok sklok;
    
    private int speler;
    
    public Display (Schaakklok sklok, int speler) {
        setText("00:00");
        this.sklok = sklok;
        this.speler = speler;
    }
    
    private void setText(String str) {
        setImage(new GreenfootImage(str, 26, Color.BLACK, Color.WHITE));
    }
    
    public void act() {
        setText(sklok.geefTijd(speler));
    }
    
    
}
