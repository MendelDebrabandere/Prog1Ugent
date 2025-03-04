import java.util.ArrayList;

public class Veterinarian
{
    private String name;
    
    private ArrayList<Animal> patients;
    
    public Veterinarian(String name)
    {
        this.name = name;
        patients = new ArrayList<Animal>();
    }

    public void newPatient(Animal patient)
    {
        if (!patients.contains(patient))
            patients.add(patient);
    }
    
    public void printPatients()
    {
        for (Animal patient : patients)
        {
            System.out.println(patient.getName() + " van " + patient.getOwner());
        }
    }
    
    public int numberOfIllAnimals()
    {
        int sickAnimals = 0;
        for (Animal patient : patients)
        {
            sickAnimals += patient.isIll() ? 1 : 0;
        }
        return sickAnimals;
    }
    
    public Animal getOldsetIllAnimal()
    {
        Animal oldestIllPatient = null;
        for (Animal patient : patients)
        {
            if (patient.isIll())
            {
                if (oldestIllPatient == null || oldestIllPatient.getAge() < patient.getAge())
                    oldestIllPatient = patient;
            }
        }
        return oldestIllPatient;
    }
    
}
