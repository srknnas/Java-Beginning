/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author SERKANNAS
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //hepsini buyuk harf yapma
        System.out.println("hepsini buyuk harf yapma");
        String s = "benim adım serkan nas";
        System.out.println(s.toUpperCase() + "\n");        
        
        //Bir harfin cümlede gecen ilk yerini bulma
        System.out.println("Bir harfin cümlede gecen ilk yerini bulma");
        int index1 = s.indexOf("serkan");
        int index2 = s.indexOf("s");
        int index3 = s.indexOf("a");
        System.out.println(index1); 
        System.out.println(index2); 
        System.out.println(index3 + "\n"); 
        
        //İlk kelimeyi bulma
        System.out.println("İlk kelimeyi bulma");
        int index4 = s.indexOf(" ");
        String ilkKelime = s.substring(0, index4);
        System.out.println(ilkKelime + "\n");
        
        //İkinci kelimeyi bulma
        System.out.println("İkinci kelimeyi bulma");
        String ikinciCumle = s.substring(index4 + 1);
        int index5 = ikinciCumle.indexOf(" ");
        String ikinciKelime = ikinciCumle.substring(0, index5);
        System.out.println(ikinciKelime + "\n");
        
        //Ucuncu kelimeyi bulma
        System.out.println("Ucuncu kelimeyi bulma");
        String ucuncuCumle = ikinciCumle.substring(index5 + 1);
        int index6 = ucuncuCumle.indexOf(" ");
        String ucuncuKelime = ucuncuCumle.substring(0, index6);
        System.out.println(ucuncuKelime + "\n");
        
        //Son kelimeyi bulma        
        System.out.println("Son kelimeyi bulma");
        String sonKelime = s.substring(s.lastIndexOf(" ") + 1);
        System.out.println(sonKelime + "\n");
        
        //Bir karakteri bulma
        System.out.println("Bir karakteri bulma");
        char karakter1 = s.charAt(0);
        System.out.println(karakter1 + "\n");
        char karakter2 = s.charAt(11);
        System.out.println(karakter2 + "\n");
        
        //Bir kelime icerip icermedigini kontrol etme
        //Buyuk kucuk harfe dikkat ediyor.
        System.out.println("Bir kelime icerip icermedigini kontrol etme");
        if(s.contains("serkan"))
            System.out.println("İçerir" + "\n");
        
        //Bir kelimenin yerine başka kelime ekleme
        System.out.println("Bir kelimenin yerine başka kelime ekleme");
        s = s.replace("serkan", "bilge");
        System.out.println(s + "\n");
        
        //Bir kelimenin basindaki ya da sonundaki tablari veya bosluklari silme
        System.out.println("Bir kelimenin basindaki ya da sonundaki tablari "
                + "veya bosluklari siler");
        s = "\t   " + s + "   \t";
        System.out.println(s);
        String bitisik = s.trim();
        System.out.println(bitisik + "\n");
        
        //Bir cümleyi kelimelerine ayirma
        System.out.println("Bir cümleyi kelimelerine ayirma");
        s = s.trim();
        int kelimeSayisi = s.split(" ").length;
        String[] kelimeler = new String[kelimeSayisi];
        kelimeler = s.split(" ");
        for(int i = 0; i < kelimeSayisi; i++)
            System.out.print(kelimeler[i] + " ");
        
        System.out.println("\n");
        
        //ASCII karsiligini byte cinsinden donme
        System.out.println("ASCII karsiligini byte cinsinden donme");
        int toplamByte = s.getBytes().length;
        byte[] byteKarsiligi = new byte[toplamByte];
        byteKarsiligi = s.getBytes();
        for(int i = 0; i < toplamByte; i++)
            System.out.print(byteKarsiligi[i] + " ");
        
        System.out.println();
    }
    
}
