/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lvrigacodingday3;

import java.util.Scanner;

/**
 *
 * @author oleg
 */
public class LvrigaCodingDay3 {

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Ievada skaitli A:");
      
      int a = input.nextInt();
      
      System.out.println("Jus varat ievadit skaitli" + a);
    }
    
    public static void main3(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadit vardu:");
        String vards = input.next();
        
        System.out.print("Ievadit uzvardu:");
        String uzvards = input.next();
        
        System.out.println("Tevi sauc "
            +vards
            +" "
            +uzvards);
        
    }
    
    
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
        
    SpeedCalculator calc = new SpeedCalculator();
      System.out.println();
      
      
    }
    
    
  
}
