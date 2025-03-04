import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oefeningen op de for-lus.
 */
public class Schaakbord extends World
{

    /**
     * Constructor
     */
    public Schaakbord()
    {   
        // 8 x 8 cellen van 45 x 45 pixels
        super(8, 8, 45); 
        
        // hier aanvullen...
        patroonF();
    }
    
    public void patroonA() {
        for (int kolom = 0; kolom < 8; ++kolom) {
            for (int rij = 1; rij < 7; ++rij) {
                addObject(new Dame(false), kolom, rij);
            }
        }
    }
    
    public void patroonB() {
        for (int kolom = 0; kolom < 4; ++kolom) {
            for (int rij = 0; rij < 8; ++rij) {
                addObject(new Toren(false), 2 * kolom, rij);
                addObject(new Paard(true), 2 * kolom + 1, rij);
            }
        }
    }
    
    public void patroonC() {
        for (int rij = 0; rij < 8; ++rij) {
            for (int kolom = 0; kolom <= rij; ++kolom) {
                addObject(new Pion(true), kolom, rij);
            }
        }
    }
    
    public void patroonD() {
        for (int kolom = 0; kolom < 8; ++kolom) {
            for (int rij = 0; rij < 8; ++rij) {
                addObject(new Loper((kolom + rij) % 2 == 0), kolom, rij);
            }
        }
    }
    
    public void patroonE() {
        for (int kolom = 0; kolom < 8; ++kolom) {
            for (int rij = 0; rij < 8; ++rij) {
                addObject(new Koning(kolom + 7 - rij < 7), kolom, rij);
            }
        }
    }
    
    public void patroonF() {
        for (int kolom = 1; kolom < 7; ++kolom) {
            for (int rij = 1; rij < 7; ++rij) {
                int index = (rij + kolom) % 6;
                switch (index) {
                    case 2:
                        addObject(new Toren(true), kolom, rij);
                        break;
                    case 3:
                        addObject(new Dame(false), kolom, rij);
                        break;
                    case 4:
                        addObject(new Paard(true), kolom, rij);
                        break;
                    case 5:
                        addObject(new Toren(false), kolom, rij);
                        break;
                    case 0:
                        addObject(new Dame(true), kolom, rij);
                        break;
                    case 1:
                        addObject(new Paard(false), kolom, rij);
                        break;
                }
            }
        }
    }
}
