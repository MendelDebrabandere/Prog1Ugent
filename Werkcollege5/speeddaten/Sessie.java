import java.util.ArrayList;
import java.util.Random;

public class Sessie {
    
    private static final Random RG = new Random();
    private ArrayList<Kandidaat> kandidaten;

    public Sessie() {
        int aantal = RG.nextInt(20) + 11;
        kandidaten = new ArrayList<>();
        for(int i=0; i<aantal; i++) {
            boolean isVrouw = RG.nextInt(2) == 0;
            kandidaten.add(new Kandidaat(isVrouw));
        }
    }

    public void doeSessie(boolean interesseInVrouwen) {
        // Print kandidaten en verwijder ongeschikte.
        System.out.println(">> Alle " + kandidaten.size() + " kandidaten:");
        int idx = 0;
        boolean superMatch = false;
        

        while(idx < kandidaten.size() && !superMatch) {
            double interesse = bepaalMatch(kandidaten.get(idx), interesseInVrouwen);
            System.out.println("Naam: " + kandidaten.get(idx).getNaam() + ", jouw match percentage: " + interesse);
            if (interesse > 0.9)
                superMatch = true;
            else if (interesse < 0.5)
                kandidaten.remove(idx);
            else 
                idx++;
        }

        
        // Print de resterende kandidaten.
        if (!superMatch) {
            System.out.println(">> Geschikte kandidaten:");
            for(Kandidaat kandidaat: kandidaten){
                System.out.println(kandidaat.getNaam());
            }
        }
        else
        {
            System.out.println("Super match found! : " + kandidaten.get(idx).getNaam());
        }


        System.out.println();
    }

    private double bepaalMatch(Kandidaat kandidaat, boolean interesseInVrouwen){
        double match = 0.0;
        if(kandidaat.isVrouw() == interesseInVrouwen) {
            match = RG.nextDouble(1);
        }
        return match;
    }

}
