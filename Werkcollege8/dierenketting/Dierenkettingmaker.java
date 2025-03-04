import java.util.ArrayList;
import java.util.Random;
/**
 * Maak een ketting van dieren met de gegeven dieren
 */
public class Dierenkettingmaker {
    
    private ArrayList<String>[] arrayVanArrayLists;
    static final private Random RG = new Random();
    
    public Dierenkettingmaker(){
        arrayVanArrayLists = new ArrayList[26];
        for (int i = 0; i < arrayVanArrayLists.length; i++) {
            arrayVanArrayLists[i] = new ArrayList();
        }
        
    }

    public void initialiseer(String[] dieren){
        for (String dier : dieren) {
            arrayVanArrayLists[(int)dier.charAt(0) - 97].add(dier);
        }
    }

    public void printInhoud(){
        for (int i = 0; i < arrayVanArrayLists.length; ++i) {
            System.out.print((char)(i+97) + ":");
            for (String dier : arrayVanArrayLists[i]) {
                System.out.print(" " + dier);
            }
            System.out.println();
        
        }
    }

    public void maakKetting(String startDier){
        System.out.print(startDier);
        int laatsteLetterIdx = (int)startDier.charAt(startDier.length()-1) - 97;
        while (!arrayVanArrayLists[laatsteLetterIdx].isEmpty()) {
            
            int dierIndex = RG.nextInt(arrayVanArrayLists[laatsteLetterIdx].size());
            String dier = arrayVanArrayLists[laatsteLetterIdx].get(dierIndex);
            arrayVanArrayLists[laatsteLetterIdx].remove(dierIndex);
            System.out.print(", " + dier);
            laatsteLetterIdx = (int)dier.charAt(dier.length()-1) - 97;
        }
        
        System.out.println(".");
    }
}
