/**
 * Een object van deze klasse stelt een bankrekening voor. De stand
 * van deze rekening mag nooit negatief zijn. Met de methoden
 * van deze klasse kan je de stand van de rekening opvragen en geld storten
 * of afhalen.
 */
public class Account {
    
    private int balance; // aantal EUROcent op de rekening

    /**
     * Een nieuwe rekening bevat 0 EUROcent
     */
    public Account(){
        // vul deze code aan
        balance = 0;
    }
    
    
    /**
     * Retourneer de stand van deze rekening
     */
    public int getBalance(){
        return balance;
    }

    /**
     * Stort het gegeven bedrag op deze rekening.
     */
    public void deposit(int amount){
        // vul deze code aan
        balance += amount;
    }
    
    /**
     * Haal het gegeven bedrag van deze rekening af. Staat er niet genoeg
     * geld op de rekening, dan doe je helemaal niets.
     */
    public void withdraw(int amount) {
        // vul deze code aan
        if (balance >= amount)
            balance -= amount;
    }   
    
    /**
     * Schrijf het gegeven bedrag over van deze rekening 
     * naar de 'destination'-rekening. Als er echter op deze rekening niet 
     * genoeg geld staat, dan doe je niets.
     */
    public void transfer(int amount, Account destination){
        // vul deze code aan
        if (balance < amount)
            return;
        
        withdraw(amount);
        destination.deposit(amount);
    }

}