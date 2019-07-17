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
        int a[] = new int[5];
        int b[] = {1,3,5,8,2};
        String str[] = {"ali", "baba", "ve", "kirk", "haramiler"};
        
        a[3] = 8;
        System.out.println(a[3]);
        System.out.println(str[0] + " " + str[1] + " " + str[2] + " " + str[3]
                + " " + str[4]);
        
    }
    
}
