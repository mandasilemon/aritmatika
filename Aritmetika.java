/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aritmetika;
import java.util.Scanner;
public class Aritmetika {

    public static void main(String[] args) {
         int bilangan1, bilangan2;
         float hasilJumlah, hasilKurang, hasilKali, hasilBagi,hasilMod; 
         /*float untuk bilangan desimal spt o,o integer(int) untuk bilangan bulat spt 1*/
        
        Scanner keyboard = new Scanner (System.in);
        System.out.print("input bilangan1 = ");
        bilangan1=keyboard.nextInt();
        System.out.print("input bilangan2= ");
        bilangan2=keyboard.nextInt();
        
        hasilJumlah=bilangan1+bilangan2;
        hasilKurang=bilangan1-bilangan2;
        hasilKali=bilangan1*bilangan2;
        hasilBagi=bilangan1/bilangan2;
        hasilMod=bilangan1%bilangan2;
        
        System.out.println("Hasil penjumlahan= "+hasilJumlah);
        System.out.println("Hasil pengurangan= "+hasilKurang);
        System.out.println("Hasil perkalian= "+hasilKali);
        System.out.println("Hasil pembagian= "+hasilBagi);
        System.out.println("Hasil modulus= "+hasilMod);
        
    }
}
