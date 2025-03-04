import java.util.ArrayList;

public class Activiteit {
    
    private int tijd;
    private String beschrijving;    
    
    public Activiteit(int tijd, String beschrijving){
        this.tijd = tijd;
        this.beschrijving = beschrijving;
    }
    
    public int getTijd(){
        return tijd;
    }
    
    public String getBeschrijving(){
        return beschrijving;
    }
    
}
