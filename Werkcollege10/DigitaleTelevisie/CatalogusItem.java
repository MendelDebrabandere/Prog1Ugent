

public class CatalogusItem
{
    private int prijs;
    private String titel;
    
    public CatalogusItem(int prijs, String titel)
    {
        this.prijs = prijs;
        this.titel = titel;
    }

    int getPrijs()
    {
        return prijs;
    }
}
