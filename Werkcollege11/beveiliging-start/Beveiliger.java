import java.util.List;

/**
 * Een beveiliger verwerkt een string door die aan verschillende helpers door te geven.
 */
public class Beveiliger implements Helper {
    
    private List<Helper> helpers;
    
    public Beveiliger (List<Helper> helpers) {
        this.helpers = helpers;
    }
    
    public String verwerk (String str) {
        // als oefening: doe dit met een while-lus met 
        // dubbele conditie en een iterator
        for (Helper helper : helpers) {
            if (str != null) {
                str = helper.verwerk(str);
            }
        }
        return str;
    }
}
