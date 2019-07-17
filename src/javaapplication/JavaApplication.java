/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author SERKANNAS
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Kosul
        System.out.println("Notunuzu Giriniz: ");
        Scanner s = new Scanner(System.in);
        
        int not = s.nextInt();
        if(not >= 90)
            System.out.println("Notunuz: AA");
        else if (not >= 80)
            System.out.println("Notunuz: BB");
        else if (not >= 70)
            System.out.println("Notunuz: CC");
        else
            System.out.println("Notunuz: F");
        
        //Dongu
        for(int j = 99; j > 0; j = j - 2) {
            System.out.println(j);
        }
        
        System.out.println();
        
        for(int j = 0; j < 100; j++) {
            if(j % 7 == 0 && j % 3 == 0) {
                System.out.println(j);
            }
        }
        
        System.out.println();
        
        for(int j = 1; j < 6; j++) {
            System.out.println((int)Math.pow(2, j));
        }
    }
    
}
