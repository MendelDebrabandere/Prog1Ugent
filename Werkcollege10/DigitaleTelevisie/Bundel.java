import java.util.ArrayList;


public class Bundel extends CatalogusItem
{
    private ArrayList<CatalogusItem> bundelContent;
    

    public Bundel(int prijs, String titel)
    {
        super(prijs, titel);
    }

    int getPrijs()
    {
        int som = 0;
        for (CatalogusItem item : bundelContent)
        {
            som += item.getPrijs();
        }
        return som;
    }
}
