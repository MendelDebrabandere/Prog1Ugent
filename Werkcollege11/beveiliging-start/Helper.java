/**
 * Interface waaraan alle helpers moeten voldoen, zowel 
 * 'controleurs' als 'opschoners'.
 */
public interface Helper {
    
    /** Controleurs: als "invoer" aan de voorwaarden voldoet, geef dan
     *  "invoer" terug. Geef anders "null" terug.
     *
     *  Opschoners: geef de opgeschoonde versie van "invoer" terug.
     */
    String verwerk (String invoer);
    
}
