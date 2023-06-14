/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Widya040423;

/**
 *
 * @author HP
 */
public class Aritmetika {
     public int tambah (int a, int b){
        return a+b;
    }
    public boolean cekBilanganGanjil (int a){
        return (a % 2==1);
    }
    public static void main (String[] args){
        Aritmetika aritmetika = new Aritmetika();
        int c = aritmetika.tambah(5,6);
        System.out.println("Nilai c = " + c);
        System.out.println("Ganjil ?" + aritmetika.cekBilanganGanjil(c));
         
    }
    
    
}

