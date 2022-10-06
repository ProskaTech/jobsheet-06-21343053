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
public class Tugas02aJS06 {
    public static void main(String[] args){
        Scanner dataIn = new Scanner (System.in);

        int angka;

        System.out.print("Masukkan Angka = ");
        angka = dataIn.nextInt();

        if(angka == 1){
            System.out.print("Angka Satu");
        }
        else if(angka == 2){
            System.out.print("Angka Dua");
        }
        else if(angka == 3){
            System.out.print("Angka Tiga");
        }
        else if(angka == 4){
            System.out.print("Angka Empat");
        }
        else if(angka == 5){
            System.out.print("Angka Lima");
        }
        else if(angka == 6){
            System.out.print("Angka Enam");
        }
        else if(angka == 7){
            System.out.print("Angka Tujuh");
        }
        else if(angka == 8){
            System.out.print("Angka Delapan");
        }
        else if(angka == 9){
            System.out.print("Angka Sembilan");
        }
        else if(angka == 10){
            System.out.print("Angka Sepuluh");
        }
        else{
            System.out.println("Invalid Number");    
        }
    }
}
