public class Activiteit {
    
    private String naam;
    private int aantalStemmen;

    public Activiteit(String naam){
        this.naam = naam;
        aantalStemmen = 0;
    }

    public String getNaam(){
        return naam;
    }

    public int getAantalStemmen(){
        return aantalStemmen;
    }

    public void stem(){
        aantalStemmen++;
    }

}
