
/**
 * Deze klasse stelt een klas van 6 leerlingen voor.
 * 
 */
public class klas
{
    /* De 6 leerlingen*/
    private Leerling[] leerlingen;
    
    private int som;

    /*contstructor*/
    public klas(){
        leerlingen = new Leerling[6]; //define aantal leerlingen
    }
    
    public int getAantal(){
        return leerlingen.length;
    }
    
    public void setLeerling(int index, String naam, int procent)
    {
        leerlingen[index] = new Leerling(naam, procent);
    }
   
    /* Geef het gemiddelde procent van de klas terug*/
    public int getGemiddelde(){
        int som = 0;
        for (Leerling lln : leerlingen)
        {
            som += lln.getProcent();
        }
        return som/leerlingen.length;
    }
    
    
     /**
      * De leerling met nummer 'leerlingnummer' van deze klas is 
      * te laat op dag 'dag'.
      */ 
    public void setTeLaat(int leerlingnummer, String dag){
        if (leerlingnummer > 0 && leerlingnummer < leerlingen.length)
            leerlingen[leerlingnummer-1].setTeLaat(dag);
        else
            System.out.println("Ongeldig leerlingnummer");
    }
    
    
    /**
     * Geef het dagnummer terug van de dag waarop de meeste 
     * leerlingen het meest te laat komen.
     */
    public int geefDagMeestTeLaat(){
        int[] dagen = new int[5];
        for (Leerling lln : leerlingen)
        {
            if(lln.geefDagMeestTeLaat() > 0) {
                dagen[lln.geefDagMeestTeLaat()]++;
            }
        }
        
        int max = dagen[0];
        int dag = 0;
        for(int i = 1 ; i < dagen.length ; i++){
            if(dagen[i] > max){
                max = dagen[i];
                dag = i;
            }    
        }
        
        System.out.println(dagen[2]);
        return dag;
    
    }   
}