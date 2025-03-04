import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Terugtrekker extends Elementaal
{
    public Terugtrekker (int leeftijd) {
        super(leeftijd);
    }


    public void act()
    {
        if (isLeeftijdNul()) {
            keerOm();
            Glijder glijder = new Glijder ();
            glijder.setRichting(getRichting());
            vervangDoor(glijder);
        } else {
            verminderLeeftijd();
            glijd();
        }

    }    
}
