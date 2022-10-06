//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.js06.java.khalilul_afwan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author KHALILUL
 */
public class Tugas01aJS06 {
    public static void main(String[] args) {
    BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));

    String a,b,c;
    float nilai1,nilai2,nilai3;
    double average;

    try{
        System.out.print("Masukkan Nilai Ujian 1 = ");
        a = masuk.readLine();
        nilai1 = Float.parseFloat(a);

        System.out.print("Masukkan Nilai Ujian 2 = ");
        b = masuk.readLine();
        nilai2 = Float.parseFloat(b);

        System.out.print("Masukkan Nilai Ujian 3 = ");
        c = masuk.readLine();
        nilai3 = Float.parseFloat(c);

        average = ((nilai1+nilai2+nilai3)/3);

        System.out.println("Nilai Ujian 1 : " +nilai1);
        System.out.println("Nilai Ujian 2 : "+nilai2);
        System.out.println("Nilai Ujian 3 : " +nilai3);
        System.out.println("Nilai Rata-Rata = " +average);

        if (average >=60){
            System.out.println("Selamat kamu berhasil :-)");
        }
        else {  
            System.out.println("Maaf kamu gagal :-(");
        }
    }
    catch(IOException e){
        System.out.println("Gagal Membaca Keyboard");
    }
    }
}
