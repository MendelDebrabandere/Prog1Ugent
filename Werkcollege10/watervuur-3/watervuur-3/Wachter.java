import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Wachter extends MetLeeftijd
{

    public Wachter (int leeftijd) {
        super (leeftijd);
    }

    public void actBijLeeftijdNul()
    {
        glijd(); // ga alvast weg van de rand...
        vervangDoor(new Glijder());
    }
    
    public void actBijLeeftijdNietNul()
    {
        
    } 
}
