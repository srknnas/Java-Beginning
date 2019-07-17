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
     * @param x
     * @param args the command line arguments
     */
    static void yaz() {
        System.out.println("Merhaba Dunya");
    }
    
    static int f(int x) {
        return (5 * x) + 10;
    }
    
    static int g(int x, int y) {
        return y + (2 * x);
    }
    
    static int r(int x) {
        if(x == 10) 
            return 10;
        
        System.out.println("x:" + x);
        return x + r(x + 1);
    }
    
    static int fib(int n) {
        if(n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else {
            return fib(n-1) + fib(n-2); 
        }
            
    }
    
    public static void main(String[] args) {
        System.out.println(f(10) + "\n");
        System.out.println(g(5,3) + "\n");
        System.out.println(f(g(5,3)) + "\n");
        yaz();
        System.out.println();
        System.out.println(r(0));
        
        System.out.println("\n" + "Fibunacci Serisi");                
        for(int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }
    }
    
}
