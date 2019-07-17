/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

/**
 *
 * @author SERKANNAS
 */
public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        
        System.out.println("sonuc1 : " + (a+b));
        System.out.println("sonuc2 : " + a+b);
        System.out.println("sonuc3 : " + a*b);
        System.out.println("sonuc4 : " + (float)((float)a/(float)b));
        System.out.println("sonuc5 : " + (a-b));
        System.out.println("sonuc6 : " + (10>>2));
        System.out.println("sonuc7 : " + (10<<2));
        System.out.println("sonuc8 : " + (10>>>2));
        System.out.println("sonuc9 : " + (a>b));
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Mesaj" + i);
        }
        int i = 0;
        while (i <10) {            
            System.out.println("Mesaj" + i);
            i++;
        }
        i = 0;
        do{
            System.out.println("Mesaj" + i);
            i++;
        }while (i <10);
    }
    
}
