
/**
 * Deze klasse stelt een leerling voor. 
 * Van elke leerling kennen we zijn naam, zijn procent en hoeveel hij keer 
 * hij te laat is gekomen op elke dag van de week.
 */
public class Leerling {
    /* naam van de leerling*/
    private String naam;
    /* procent van de leerling*/
    private int procent;
    
    /* hoeveel keer zijn ze al te laat gekomen op maandag/dinsdag/... */
    private int[] aantalKeerOpDagen;

    public Leerling(String naam, int procent){
        this.naam = naam;
        this.procent = procent;
        aantalKeerOpDagen = new int[]{-1,-1,-1,-1,-1};
    }
    
    public String getNaam(){
        return naam;
    }

    
    public int getProcent(){
        return procent;
    }
     
    public void setProcent(int procentn){
        procent = procent;
    }
    
    /* Deze leerling is te laat gekomen op dag 'dag'*/
    public void setTeLaat(String dag){
        int dagidx = 0;
        if(dag.equals("maandag")) {
            aantalKeerOpDagen[0]++;
        } else if(dag.equals("dinsdag")) {
            aantalKeerOpDagen[1]++;
        } else if(dag.equals("woensdag")) {
            aantalKeerOpDagen[2]++;
        } else if(dag.equals("donderdag")) {
            aantalKeerOpDagen[3]++;
        } else if(dag.equals("vrijdag")) {
            aantalKeerOpDagen[4]++;
        } else {
            System.out.println("Je hebt een ongeldige dag opgegeven");
        }            
    }
    
    /** 
     * Geef het totaal aantal keer terug dat deze leerling te laat was.
     */
    
    public int aantalTelaat(){
        int som = 0;
        for (int aantal : aantalKeerOpDagen)
        {
            som += aantal;  
        }
        return som;
    }
    
    /**
     * Op welke dag komt deze leerling het meest te laat?
     * Geef het cijfer van de dag in de week terug. (vb. 0 indien maandag, 
     * 2 indien woensdag)
     * Als er meerdere dagen zijn waarop deze leerling het meest te laat komt,
     * geef dan de eerste dag terug.
     * Geef -1 terug als de leerling nog nooit te laat kwam.
     */
    public int geefDagMeestTeLaat(){
        int max = -1;
        int dag = -1;
        for (int idx = 0; idx < aantalKeerOpDagen.length; idx++)
        {
            if (aantalKeerOpDagen[idx] > max)
            {
                max = aantalKeerOpDagen[idx];
                dag = idx;
            }
        }
        return dag;
    }    
}
