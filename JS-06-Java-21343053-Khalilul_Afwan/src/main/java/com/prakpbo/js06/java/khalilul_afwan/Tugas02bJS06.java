//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.js06.java.khalilul_afwan;

import java.util.Scanner;

/**
 *
 * @author KHALILUL
 */
public class Tugas02bJS06 {
    public static void main(String[] args){
        Scanner masuk = new Scanner (System.in);

        int angka;

        System.out.print("Masukkan Angka = ");
        angka = masuk.nextInt();

        switch(angka){
            case 1 -> System.out.println("Angka Satu");
            case 2 -> System.out.println("Angka Dua");
            case 3 -> System.out.println("Angka Tiga");
            case 4 -> System.out.println("Angka Empat");
            case 5 -> System.out.println("Angka Lima");
            case 6 -> System.out.println("Angka Enam");
            case 7 -> System.out.println("Angka Tujuh");
            case 8 -> System.out.println("Angka Delapan");
            case 9 -> System.out.println("Angka Sembilan");
            case 10 -> System.out.println("Angka Sepuluh");
            default -> System.out.println("Invalid Number");
        }
    }
}
