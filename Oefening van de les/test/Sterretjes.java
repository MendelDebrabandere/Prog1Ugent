public class Sterretjes
{
    public void sterretjes(int n) {
        for (int i = 1; i <= n; ++i) {
            if (i != 1)
                System.out.print(" ");
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    
    public void kerstboom(int n) {
        for (int i = 1; i <= n; i++) {
            for (int spaties = 0; spaties < n - i ; spaties++) {
                System.out.print(" ");
            }
            for (int ster = 0; ster < 2 * i - 1; ++ster) {
                System.out.print("*");
            }
            for (int spaties = 0; spaties < n - i ; spaties++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int spaties = 0; spaties < n-1; spaties++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int spaties = 0; spaties < n-1; spaties++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void dambord(int n) {
        for (int rij = 0; rij < n; rij++) {
            for (int doubler = 0; doubler < 2; doubler++) {
                for (int vak = 0; vak < n; vak++) {
                    System.out.print((vak+rij)%2==0 ? "***" : "   ");
                }
                System.out.println();
            }
        }
    }
}
