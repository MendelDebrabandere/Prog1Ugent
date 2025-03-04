import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Wachter extends Elementaal
{

    public Wachter (int leeftijd) {
        super(leeftijd);
    }

    public void act()
    {
        if (isLeeftijdNul()) {
            glijd(); // ga alvast weg van de rand...
            Glijder glijder = new Glijder();
            glijder.setRichting(getRichting());
            vervangDoor(glijder);
        } else {
            verminderLeeftijd();
        }
    }    
}
