

public class Film extends CatalogusItem
{
    private int seizoen;
    
    public Film(int prijs, String titel, int seizoen)
    {
        super(prijs, titel);
        
        this.seizoen = seizoen;
    }


}
