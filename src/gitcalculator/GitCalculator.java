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
public class GitCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        while (true)
        {
            System.out.println("Välkommen till Calculator, var vänlig och välj ditt alterantiv");
            System.out.println("1. Plussa två tal");
            System.out.println("2. Minus två tal");
            System.out.println("3. Dela två tal");
            System.out.println("4. Gångra två tal");
            System.out.println("Skriv in siffran på valet du har valt, avsluta med enter!");
            
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            
            switch (option)
            {
                case 1:
                {
                    //vincents del, välj en case och kommentera vilken del ni kör
                    messageAdd add = new messageAdd();
                    add.start();
                    break;
                }
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                
                case 4:
                    break;
                    
                default:
                {
                    System.out.println("Kunde ej hitta valet, försök igen!");
                    System.out.println("");
                }
            }
        }  
    }
}
