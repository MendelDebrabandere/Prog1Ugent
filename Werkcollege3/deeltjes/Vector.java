/**
 * Stelt een vector voor in twee dimensies
 */
public class Vector {
    
   private double x;
   
   private double y;
   
   /**
    * Maak een nieuwe vector aan met de gegevenX- en Y-coördinaten
    */
   public Vector (double x, double y) {
       this.x = x;
       this.y = y;
   }
   
   /**
    * De X-coördinaat, afgerond tot een geheel getal
    */
   public int getIntX () {
       return (int)Math.round(x);
   }
   
   /**
    * De y-coördinaat, afgerond tot een geheel getal
    */
   public int getIntY() {
       return (int)Math.round(y);
   }   
   
   /**
    * De norm (=lengte) van de gegeven vector
    */
   public double norm () {
       // invullen!
       return Math.sqrt(x*x + y*y);
   }
   
   /**
    * Tel de gegeven vector op bij de huidige. Verandert de huidige vector.
    */
   public void add (Vector other) {
       // invullen!
      x += other.x;
      y += other.y;
   }
   
   /**
    * Vermenigvuldig deze vector met de gegeven scalaire factor.  
    * Verandert de huidige vector.
    */
   public void scale (double factor) {
       // invullen!
       x *= factor;
       y *= factor;
   }
   
   /**
    * Herschaal de huidige vector zodanig dat hij de opgegeven lengte heeft. 
    * Verandert de huidige vector.
    */
   public void scaleToNorm (double newNorm) {
       // invullen!
       double normScaling = newNorm/norm();
       x *= normScaling;
       y *= normScaling;
   }
   
   /**
    * Geef een nieuwe vector terug die overeenkomt met this - other. Laat de huidige
    * vector ongemoeid!
    */
   public Vector minus (Vector other) {
       // invullen!
       return new Vector(x - other.x, y - other.y);
   }
   
}
