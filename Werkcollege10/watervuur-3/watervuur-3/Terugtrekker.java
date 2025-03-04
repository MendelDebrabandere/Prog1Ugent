import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Terugtrekker extends MetLeeftijd
{
 
    public Terugtrekker (int leeftijd) {
        super (leeftijd);
    }

    public void actBijLeeftijdNul()
    {
        keerOm();
        vervangDoor (new Glijder ());
    }
    
    public void actBijLeeftijdNietNul()
    {
        glijd();
    }  
}
