public class While2Cond
{
    public While2Cond()
    {
    }

    public int zoekM(int n)
    {
        int m = 0;
        
        boolean mGevonden = false;
        
        while (m <= 21 && !mGevonden) {
            ++m;
            if (21*m % n == 1){
                mGevonden = true;
            }            
        }
        if (mGevonden)
            return m;
        else 
            return 0;
    }
}
