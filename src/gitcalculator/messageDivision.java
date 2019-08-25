package gitcalculator;

import java.util.Scanner;

public class messageDivision {

        public void start()
    {
        System.out.println("");
        System.out.println("Skriv in första talet du vill dividera");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        System.out.println("Skriv in andra talet du vill dividera");
        double y = scan.nextDouble();

        calculate(x, y);
    }

    public void calculate(double first, double second)
    {
        done(first / second);
    }

    public void done(double result)
    {
        System.out.println("");
        System.out.println("####################");
        System.out.println("Ditt resultat är följande: " + result);
        System.out.println("####################");
        System.out.println("");
    } 
}