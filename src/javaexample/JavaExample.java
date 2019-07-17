/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author SERKANNAS
 */
public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("a.txt");
        try {
            //Read from file
            FileReader fr1 = new FileReader(f);              
            int c = fr1.read();
            while(c!=-1) {
                System.out.print((char)c);
                c = fr1.read();                
            }
            fr1.close();                       
            
            System.out.println();
            
            //Read from file
            FileReader fr2 = new FileReader(f);  
            
            //Dosyanin icinde kac byte'lik veri oldugunu gosterme
            long length = f.length();
            char[] buffer = new char[(int)length];
            fr2.read(buffer, 0, (int)length);
            for(int i = 0; i < length; i++)     
                System.out.print(buffer[i]);
            
            System.out.println();
            
            //Read from file
            BufferedReader br = new BufferedReader(new FileReader(f));            
            System.out.println(br.readLine());
            br.close();            
            
            //Write to file
            File fi = new File("b.txt");
            FileWriter fw = new FileWriter(fi);            
            fw.write("Serkan NAS");
            fw.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
