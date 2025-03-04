

public class Pet extends Animal
{

    int jaarVaccinatie;
    
    public Pet(String name, String owner, int age, int jaarVaccinatie){
        super(name, owner, age);
        this.jaarVaccinatie = jaarVaccinatie;
    }

    public void printInfo ()
    {
        super.printInfo();
        System.out.println("jaarVaccinatie = " + jaarVaccinatie);
    }
}
