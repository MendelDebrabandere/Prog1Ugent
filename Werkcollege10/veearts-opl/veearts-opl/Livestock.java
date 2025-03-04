

public class Livestock extends Animal
{
    private boolean kanBijArts;


    public Livestock(String name, String owner, int age, boolean kanBijArts){
        super(name, owner, age);
        this.kanBijArts = kanBijArts;
    }

    public void printInfo ()
    {
        super.printInfo();
        System.out.println("kanBijArts = " + kanBijArts);
    }
}
