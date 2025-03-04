import java.util.Random;
public class Leerling {
    
    private static final Random RG = new Random();
    
    public Leerling(){
    }

    public void brengStemUit(Activiteit[] activiteiten){        
        activiteiten[RG.nextInt(activiteiten.length)].stem();
    }

}
