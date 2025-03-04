import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Speelveld voor het Snake-spelletje.
 */
public class Speelveld extends World
{
    // Deze constanten leggen de breedte en de hoogte van het speelveld vast.
    public static final int BREEDTE = 40;
    public static final int HOOGTE = 30;
    
    // Dit object stelt de kop van de rups voor (er is altijd precies één rups).
    private KopComponent rups;

    public Speelveld() {    
        // Create a new world with 40x30 cells with a cell size of 16x16 pixels.
        super(BREEDTE, HOOGTE, 16);
        
        // Met deze bijzondere methode-oproep leggen we de volgorde vast waarin de act-methodes
        // uitgevoerd worden. Dit is noodzakelijk voor de goede werking van het spel.
        setActOrder(RupsComponent.class, KopComponent.class);        
        
        // Voeg de rups toe aan het speelveld op startpositie (5,5).
        rups = new KopComponent(5, 5);
        addObject(rups, 5, 5);
    }
    
    public void act() {
        // TODO: vul aan
    }
    
}
