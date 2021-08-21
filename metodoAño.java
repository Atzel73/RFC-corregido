/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class metodoAño {
            public static String getBirthYear(String year){

        char arregloYear[] = year.toCharArray();
        char BY1 = arregloYear[2];
        char BY2 = arregloYear[3];
        String Letters4 ;
        
        return Letters4 = String.valueOf(BY1) + String.valueOf(BY2);
    }
    
}
