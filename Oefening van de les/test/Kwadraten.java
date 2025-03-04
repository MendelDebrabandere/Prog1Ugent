public class Kwadraten {
    public void printKleinereKwadraten(int n) {
        System.out.print(1);        
        for (int i = 2; i * i <= n ; i++) {
            System.out.print(", " + i * i );
        }
        System.out.println();
    }
    
    public void printAantalKwadraten(int n) {
        printKleinereKwadraten(n*n);
    }
}