import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value");
        double payment = scanner.nextDouble();
        scanner.close();
        
    NumberFormat nFormatIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    String india = nFormatIndia.format(payment);

    NumberFormat nFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
    String china = nFormatChina.format(payment);

    NumberFormat nFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String france = nFormatFrance.format(payment);
    
    NumberFormat nFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
    String us = nFormatUS.format(payment);
    

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
