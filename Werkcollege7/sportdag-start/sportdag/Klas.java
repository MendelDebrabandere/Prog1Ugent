public class Klas {
    
    private int aantalLeerlingen;

    private Leerling[] leerlingen;
    
    public Klas(){
        aantalLeerlingen = 20;
        leerlingen = new Leerling[aantalLeerlingen];
        
        for (int i = 0; i < aantalLeerlingen; ++i) {
            leerlingen[i] = new Leerling();
        }
        
    }

    public void voerKlassikaleStemmingUit(Activiteit[] activiteiten) {
        for (Leerling leerling :leerlingen) {
            leerling.brengStemUit(activiteiten);
        }
    }

}
