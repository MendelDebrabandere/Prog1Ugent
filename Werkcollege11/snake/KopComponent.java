import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Speciale RupsComponent die de kop van de rups voorstelt.
 * De kop van de rups staat in voor het verwerken van de toetsenbordinput
 * en houdt ook een lijst bij met alle andere componenten van de rups.
 */
public class KopComponent extends RupsComponent
{
    // De verschillende delen van de rups.
    // De kop (dit object) staat op positie 0 in de lijst.
    private List<RupsComponent> rupsComponenten;

    public KopComponent(int x, int y) {
        super(x, y, Richting.RECHTS);
        rupsComponenten = new ArrayList<>();       
        rupsComponenten.add(this);
    }

    public void act() {
        // De act van RupsComponent zorgt voor de verplaatsing van de kop.
        besturingToetsenbord(); // verander richting kop afhankelijk van input toetsenbord
        super.act();
        controleerGameOver();   // rups raakt zichzelf => game over
        richtingenOpschuiven(); // verschuif richtingen van de componenten van de rups

        // TODO: verwijder deze if!
        // Laat de rups 60 stappen groeien om het programma te kunnen testen.
        if (rupsComponenten.size() < 60) {          
            groei();
        }             
    }

    private void controleerGameOver() {
        // Als de rups zichzelf "raakt" is het spelletje teneinde,
        // dit moet enkel voor de kop van de rups gecontroleerd worden.
        if (isTouching(RupsComponent.class)) {
            Greenfoot.stop();
        }        
    }

    private void richtingenOpschuiven() {
        // Elk stukje van de rups beweegt in een bepaalde richting.
        // Bij elke stap worden de richtingen één plaats "opgeschoven".
        // De richting van het laatste stukje wordt dan de richting van het voorlaatste stukje,
        // enzovoort.
        // De kop blijft voorlopig in dezelfde richting bewegen.
        for (int i = rupsComponenten.size() - 1; i > 0; i--) {
            rupsComponenten.get(i).richting = 
                rupsComponenten.get(i - 1).richting;
        }        
    }

    private void besturingToetsenbord() {
        // Verander de richting van de kop als op een toets gedrukt wordt.
        // Belangrijk om op te merken is dat we niet mogen terugkeren in dezelfde richting,
        // tenzij de lengte 1 is!
        int nieuweRichting = Richting.getToetsRichting();
        if (nieuweRichting >= 0) {
            if (rupsComponenten.size() == 1 ||
                    !Richting.zijnTegengesteld(nieuweRichting, richting) 
            ){
                richting = nieuweRichting;
            }
        }
    }

    public void groei() {
        // Het nieuwe stuk komt achter het laatste. Waar "achter het laatste" precies is,
        // kunnen we bepalen door de richting van het laatste stuk om te keren.
        RupsComponent laatste = rupsComponenten.get(rupsComponenten.size() - 1);
        int x = normalizeerX(laatste.getX() - Richting.getDeltaX(laatste.richting));
        int y = normalizeerY(laatste.getY() - Richting.getDeltaY(laatste.richting));

        // Het nieuwe stuk beweegt in dezelfde richting als het laatste stuk.
        RupsComponent nieuwStuk = new RupsComponent(x, y, laatste.richting);
        getWorld().addObject(nieuwStuk, x, y);

        rupsComponenten.add(nieuwStuk);
    }
}
