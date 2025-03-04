public class School {
    // Activiteiten
    private int aantalActiviteiten;
    private Activiteit[] activiteiten;
    
    // Klassen
    private int aantalKlassen;
    private Klas[] klassen;

    public School(){
        aantalActiviteiten = 5;
        activiteiten = new Activiteit[5];
        this.activiteiten[0] = new Activiteit("Muurklimmen");
        this.activiteiten[1] = new Activiteit("Zumba");
        this.activiteiten[2] = new Activiteit("Minigolf");
        this.activiteiten[3] = new Activiteit("Tennis");
        this.activiteiten[4] = new Activiteit("Zaalvoetbal");

        aantalKlassen = 10;
        klassen = new Klas[aantalKlassen];
        for (int i = 0; i < aantalKlassen; ++i) {
            klassen[i] = new Klas();
        }
    }
    
    public Activiteit[] getActiviteiten(){
        return activiteiten;
    }
    
    public void voerStemmingUit(){
        for (Klas klas : klassen) {
            klas.voerKlassikaleStemmingUit(activiteiten);
        }
    }
    
    public void printResultaten(){
        for(Activiteit activiteit: activiteiten){
            System.out.println(activiteit.getNaam() + ": " + activiteit.getAantalStemmen());
        }
        System.out.println();
    }
    
    public int getTotaalAantalStemmen(){
        int totaalAantalStemmen = 0;
        
        for (Activiteit activiteit : activiteiten) {
            totaalAantalStemmen += activiteit.getAantalStemmen();
        }
        
        return totaalAantalStemmen;
    }
    
    public Activiteit getPopulairsteActiviteit(){
        Activiteit activiteit = null;
        
        for (Activiteit a : activiteiten) {
            if (activiteit == null || a.getAantalStemmen() > activiteit.getAantalStemmen()) {
                activiteit = a;              
            }
        }
        
        return activiteit;
    }

    public Activiteit getMinstPopulaireActiviteit(){
        Activiteit activiteit = null;
        
        for (Activiteit a : activiteiten) {
            if (activiteit == null || a.getAantalStemmen() < activiteit.getAantalStemmen()) {
                activiteit = a;              
            }
        }
        
        
        return activiteit;
    }
    
}
