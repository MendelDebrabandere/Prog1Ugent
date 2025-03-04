public class Kamer {

    private int aantal; 
    private Lamp lamp;
    
    public Kamer(Lamp lamp, int aantal) {
        this.lamp = lamp;
        this.aantal = aantal;
    }
    
    public void vermeerderMuizen() {
        aantal ++;
        updateLamp();
        //System.out.println(aantal + " muizen in " + naam);
    }
    
    public void verminderMuizen() {
        aantal --;
        updateLamp();
        //System.out.println(aantal + " muizen in " + naam);
    }
    
    private void updateLamp() {
        lamp.toggleLamp(aantal != 0); // in de lamp zelf checken we dat we niet onnodig de png veranderen naar dezelfde png, dus is ok om dit elke keer te callen
    }
}
