
public class Aflevering extends CatalogusItem
{
    private String regisseur;
        
    public Aflevering(int prijs, String titel, String regisseur)
    {
        super(prijs, titel);
        
        this.regisseur = regisseur;
    }


}
