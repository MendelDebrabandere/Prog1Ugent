/**
 * Bevat de plattegrond van het kasteel als een rooster van 14x14 posities.
 */
public class FloorMap {

    // gecodeerde versie van de plattegrond
   private String[] map;
        
   public FloorMap () {
       map = new String[] {
        "**************",
        "*s           *",
        "* ******** * *",
        "* *      * * *",
        "* * **** * * *",
        "* * *    *   *",
        "* * **** * * *",
        "* *        * *",
        "* ***** ** * *",
        "*          *s*",
        "* ***** **** *",
        "* * * * * ** *",
        "* *     *    *",
        "**************" };
       
   }
      
   /**
    * Staat er een muur op de gegeven plaats?
    */
   public boolean isWall(int row, int column) {
       return map[row].charAt(column) == '*';
   }
   
   /**
    * Staat er een startplaats op de gegeven plaats?
    */
   public boolean isStartPosition(int row, int column) {
       return map[row].charAt(column) == 's';
   }
      
   /**
    * Kan je vanuit de gegeven positie bewegen in de aangegeven richting?
    * @param direction 0,1,2,3 voor rechts, onder, links, boven
    */
   public boolean canMove (int row, int column, int direction) {
       int[] rowAdd = {0, 1, 0, -1};
       int[] columnAdd = {1, 0, -1, 0};
       
       return !isWall(row + rowAdd[direction], column + columnAdd[direction]);
   }
   
}
