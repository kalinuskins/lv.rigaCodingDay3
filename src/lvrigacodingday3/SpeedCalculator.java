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
public class SpeedCalculator {
    
    public SpeedCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ludzu ievadiet attalumu");
        int distance = input.nextInt();
        //Datu nolasisana
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int seconds = input.nextInt();
        
        getTotalTime(hours, minutes, seconds);
        System.out.println();
        int totalTime = input.nextInt();
        // atrums
        
        
        getSpeed(distance, totalTime);
    }

    private void getTotalTime(int hours, int minutes, int seconds) {
        System.out.print("Pilns laiks");
        
        int copLaiks = hours*60*60+minutes*60+seconds;
        System.out.println(copLaiks);
    }
     
    public void getSpeed (int distance, int totalTime){
        double speed = (double)distance / (double)totalTime;
        
        System.out.println("Atrums ="
            +speed);
        double speedKmh = ((double)distance/1000);
        
               System.out.println(speedKmh);
      
    }
    

        
        

}
