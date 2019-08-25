/*
 */

package gitcalculator;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class messageMultiply {

        public void start()
    {
        System.out.println("");
        System.out.println("Skriv in första talet du vill multiplicera");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        System.out.println("Skriv in andra talet du vill multiplicera");
        int y = scan.nextInt();
        
        calculate(x, y);
    }
    
    public void calculate(int first, int second)
    {
        done(first * second);
    }
    
    public void done(int result)
    {
        System.out.println("");
        System.out.println("####################");
        System.out.println("Ditt resultat är följande: " + result);
        System.out.println("####################");
        System.out.println("");
    } 
}

