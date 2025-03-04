import java.util.ArrayList;

/**
 * Veearts (en zijn praktijk)
 */
public class Veterinarian {
    
    private String name;
    private ArrayList<Animal> patients; // NIET ArrayList<String>

    /**
     * Constructor for objects of class Veterinarian
     */
    public Veterinarian(String name) {
        this.name = name;
        this.patients = new ArrayList<>();  
           // this. is hier niet noodzakelijk, maar is wel gebruikelijk
    }

    public void newPatient(Animal patient) {
        patients.add(patient);
    }

    public void printPatients() {
        for (Animal p : patients) {
            System.out.println(p.getName() + " van " + p.getOwner());
        }
    }

    public int numberOfIllPatients() {
        int count = 0;
        for (Animal p : patients) {
            if (p.isIll()){
                count++;
            }
        }
        return count;
    }

    public Animal getOldestIllAnimal() {
        Animal oldest = null;
        int age = -1;
        for (Animal p : patients) {
            if (p.isIll() && p.getAge() > age){
                oldest = p;
                age = p.getAge();
            }
        }
        return oldest;
    }
}
