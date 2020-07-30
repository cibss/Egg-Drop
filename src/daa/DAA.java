
package daa;

import static daa.EggDrop.eggDrop;

public class DAA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // n = jumlah egg , k = jumlah floor
        int n = 2, k = 10; 
        
        System.out.println("Jumlah egg = "+n);
        System.out.println("Jumlah floor = "+k);
        System.out.println("Jumlah min percobaan (worst case) = "+eggDrop(n, k)); 
    } 
    
    
}
