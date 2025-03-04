import java.util.Random;
import java.util.ArrayList;

public class RandomTester
{
    private static final Random RG = new Random();

    public RandomTester()
    {
    }
    
    public void printOneRandom()
    {
        System.out.println(RG.nextInt()); 
    }

    public void printMultiRandom(int howMany)
    {
        for (int i = 0; i < howMany; ++i) {
            printOneRandom();
        }
    }
    
    public int throwDice() {
        return RG.nextInt(1, 6);
    }
    
    public String getResponse(ArrayList<String> list) {
        int i = RG.nextInt() % list.size();
        return list.get(i);
    }
    
    public int max(int max) {
        return minmax(0,max);
    }
    
    public int minmax(int min, int max) {
        return RG.nextInt(min, max + 1);
    }
}
