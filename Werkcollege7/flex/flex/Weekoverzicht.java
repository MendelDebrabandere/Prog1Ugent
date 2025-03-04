import java.util.ArrayList;

public class Weekoverzicht {

    private int dag;
    private Activiteit[] activiteiten;

    public Weekoverzicht() {
        dag = 0;
        activiteiten = new Activiteit[7];
    }

    public void logActiviteit(Activiteit activiteit) {
        if(dag < 7) {
            dag++;
            activiteiten[dag] = activiteit;
        } else {
            System.out.println("Er zijn maar zeven dagen in een week.");
        }
    }

    public Activiteit getActiviteitOpDag(int dag){
        Activiteit activiteit = null;
        if(0 <= dag && dag < this.dag){
            activiteit = activiteiten[dag];
        } else {
            System.out.println("Ongeldige datum");
        }
        return activiteit;
    }

    public void verwijderActiviteitOpDag(int dag){
        if(0 <= dag && dag < this.dag){
            activiteiten[dag] = null;;
        } else {
            System.out.println("Ongeldige datum");
        }
    }

    public boolean isVoldoendeGewerkt(){
        int totaal = 0;
        for(Activiteit a: activiteiten){
            if(a != null) {
                totaal += a.getTijd();
            }
        }
        return totaal >= 40;
    }

}
