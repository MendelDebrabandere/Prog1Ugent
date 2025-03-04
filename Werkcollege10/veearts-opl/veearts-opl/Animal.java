/**
 * Dierlijke patient van een veearts.
 */
public class Animal {
    /**eigenaar van het dier **/
    private String owner;
    
    /**leeftijd van het dier**/
    private int age;
    
    /** is het dier ziek?**/
    private boolean ill;
    
    /** heeft het dier al bezoek gehad van de veearts?**/
    private boolean visited;
    
    /**naam van het dier**/
    private String name;
    
    public Animal(String name, String owner, int age){
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.ill = false;
        this.visited = false;
    }
    
    public void printInfo ()
    {
        System.out.println("Info over " + name + ":");
        System.out.println("owner = " + owner);
        System.out.println("age = " + age);
        System.out.println("ill = " + ill);
        System.out.println("visited = " + visited);
    }
    
    /**
     * Is het dier ziek?
     */
    public boolean isIll(){
        return ill;
    }
    
    /**
     * Geef aan of het dier ziek is.
     */
    public void setIll(boolean ill){
        this.ill = ill;
    }
    
    /**
     * Is het dier reeds bezocht door de veearts?
     */
    public boolean isVisited () {
        return visited;
    }
    
    /**
     * Geef aan of het dier reeds is bezocht door de veearts.
     */
    public void setVisited (boolean visited) {
        this.visited = visited;    
    }
    
    
    /**
     * Eigenaar van dit dier.
     */
    public String getOwner(){
        return owner;
    }
        
    /**
     * Naam van dit dier.
     */
    public String getName(){
        return name;
    }
    
    /**
     * Leeftijd van dit dier.
     */
    public int getAge(){
        return age;
    }
    
    /**
     * Stel de leeftijd in.
     */
    public void setAge(int age){
        this.age = age;
    }

}
