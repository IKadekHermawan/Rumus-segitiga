/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luassegitiga;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author USER
 */
public class Luassegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          BufferedReader dtain = new BufferedReader (new InputStreamReader (System.in));
          
          String nama = "I Kadek Hermawan";
          int nim = 22010186;
          
          System.out.println("Nama saya: "+ nama);
          System.out.println("NIM      : "+ nim);
        
        Double luas;
        int a = 0;
        int t = 0;
        String alas ="";
        String tinggi="";
        
        System.out.println("HITUNG LUAS SEGITIGA");
        
        try{
            System.out.print("Masukan Nilai Alas: ");
            alas = dtain.readLine();
            System.out.print("Masukan Nilai Tinggi: ");
            tinggi = dtain.readLine();
        }catch(IOException e) {
            System.out.println("Kesalahan Dalam Input Data!");
        }
        a = Integer.parseInt(alas);
        t = Integer.parseInt(tinggi);
        luas = 0.5 * a * t;
        System.out.println("Hasil Luas Segitiga: " + luas);
         
    }
    
}
