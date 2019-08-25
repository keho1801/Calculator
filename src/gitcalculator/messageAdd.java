/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitcalculator;

import java.util.Scanner;

/**
 *
 * @author work
 */
public class messageAdd {
    
    public void start()
    {
        System.out.println("");
        System.out.println("Skriv in första talet du vill plussa");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        System.out.println("Skriv in andra talet du vill plussa");
        int y = scan.nextInt();
        
        calculate(x, y);
    }
    
    public void calculate(int first, int second)
    {
        done(first + second);
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
