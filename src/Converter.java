
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oleg
 */
public class Converter {
    public Converter(){
        Scanner input = new Scanner(System.in);
        
        //Izvadam 'Ludzu ievadi gradus'
        System.out.println("Ludzu ievadiet gradusu: ");
        // nolasam skaitli
        
        
        // nolasam mervienibu
        char unit = input.next().charAt(0);
        //ja mervieniba ir == "C"
        //izsauc toFahrenheit(..)
        // ja 'mervieniba' == "F"
        // izsauc toCelsius(..)
        //...
        //...
        /*
        + parbaudit, vai strada gan lielie burti,
        gan mazie
        +veikt parbaudi, vai ievadita pielaujama mervieniba
        
        */
    }
    
    private int toFarenheit(int value){
        return 0;
        //Parversh 'value' uz Farenheitiem
        //atgriez aprekinato vertibu
    }
    
    private int toCelsius(int value){
        return 0;
        //Parversh 'value' uz Celsiju
        //atgriez aprekinato vertibu
    }
}
