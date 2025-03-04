import java.util.Random;
/**
 * Eenvoudige test klasse
 * Initialiseer de Dierenkettingmaker, print de inhoud en maak een ketting.
 *
 * @author Ellen Vanhove
 * @version v0.2
 */
public class Tester
{
    public Tester()
    {
    }

    /**
     * er is maar 1 oplossing
     */
    public void kleinTestje(){
        Dierenkettingmaker dkm = new Dierenkettingmaker();        
        String[] dieren = {"aap","papegaai","inktvis","spin","neushoorn"};
        dkm.initialiseer(dieren);
        dkm.printInhoud();
        dkm.maakKetting("aap");
        //dkm.printInhoud(); //moet leeg zijn
    }
    
    /**
     * er zijn meer oplossingen 
     */
    public void mediumTest(){
        Dierenkettingmaker dkm = new Dierenkettingmaker();        
        String[] dieren = {"aap","papegaai","inktvis","panter","raaf","fret","toekan","spin","sijs","neushoorn", "nijlpaard"};
        dkm.initialiseer(dieren);
        dkm.printInhoud();
        dkm.maakKetting("aap");
    }

    /**
     * veel opties -> veel oplossingen
     */
    public void groteTest(String dier){
        Dierenkettingmaker dkm = new Dierenkettingmaker();
        String[] dieren = {
            "aap","aal","aardvarken","albatros","arend",
            "bever","bijeneter","bosmuis", "bunzing", "bonobo","bizon",
            "coyote","chimpansee","cheeta","cavia",
            "das", "dolfijn", "dromedaris","dodo","duif",
            "ekster","eekhoorn", "eland", "eenhoorn", "ezel", "egel",
            "fret", "flamingo", "fazant",
            "geit", "gorilla","gans", "goudvis",
            "haas", "hond", "hamster","huismuis",
            "ijsbeer", "inktvis", "ijsvogel", "ijseend",
            "jaguar", "jachtluipaard", "jak", "jan-van-gent",
            "kat", "konijn", "kameel", "koala", "kanarie", "kalkoen", "kip", "koekoek",
            "lama", "luipaard",
            "mol", "muskusrat", "merel",
            "nijlpaard","neushoorn", "nachtegaal",
            "otter", "orka","ooievaar",
            "papegaai","paard", "poema", "potvis","panter", "parkiet", "pladijs", "pauw", "pinguïn",
            "quetzal",
            "ree","rendier","reuzenmiereneter", "raaf", "regenworm", "roodborstje",
            "schaap","stokstaartje", "sneeuwmuis", "spin", "slak","sijs", "struisvogel",
            "tijger", "tong", "tuinspitsmuis","toekan","tortelduif", "torenvalk",
            "uil",
            "varken", "vos", "vleermuis", "veldmuis", "vink",
            "walrus", "wasbeer", "woelrat", "wolf" ,"wezel", "wombat",
            "zeeotter", "zwartvoetkat", "zebra", "zwaan"
            };
        dkm.initialiseer(dieren);
        dkm.printInhoud();
        dkm.maakKetting(dier);
    }

    
}