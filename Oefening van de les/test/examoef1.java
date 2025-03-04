import java.util.ArrayList;


public class examoef1
{
    public examoef1()
    {
        float[] tabel = {0.2f,0.3f, 1.3f, -0.1f};
        int grootsteidx = maxindex(tabel);
        System.out.println(grootsteidx);
    }

    public int maxindex(float[] tabel) {
        int grootsteidx = 0;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] > tabel[grootsteidx]) {
                grootsteidx = i;
            }
        }
        return grootsteidx;
    }
    
    public void vraag3 (){
        for (int x = 1; x <= 672; x++) {
            for (int y = x+1; y < (float)(2020-x)/(float)2 ; y++) {
                System.out.println(x+", "+y+", "+(2020-x-y));
            }
        }
    }
    
    
    public ArrayList<String> woorden(String lijn) {
        ArrayList<String> outputlist = new ArrayList();
        String currword = "";
        for (char letter : lijn.toCharArray()) {
            if (Character.isLetter(letter)) {
                currword += letter;
            } else if (!currword.equals("")) {
                outputlist.add(currword);
                currword="";
            }
        }
        if (!currword.equals("")) {
            outputlist.add(currword);
        }
        return outputlist;
    }
    
    
    
    
    
    
}
