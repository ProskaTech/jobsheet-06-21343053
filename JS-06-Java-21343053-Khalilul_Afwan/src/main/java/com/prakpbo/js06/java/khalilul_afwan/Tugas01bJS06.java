//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.js06.java.khalilul_afwan;

import javax.swing.JOptionPane;

/**
 *
 * @author KHALILUL
 */
public class Tugas01bJS06 {
    public static void main(String[] args){
        int nilai1, nilai2, nilai3;
        double avg;
        String hasil;
        
        nilai1 = Integer.valueOf(JOptionPane.showInputDialog("Input Nilai Ujian 1 : "));
        nilai2 = Integer.valueOf(JOptionPane.showInputDialog("Input Nilai Ujian 2 : "));
        nilai3 = Integer.valueOf(JOptionPane.showInputDialog("Input nilai Ujian 3 : "));
        
        avg = ((nilai1+nilai2+nilai3)/3);

        if(avg >= 60){
            hasil = "Selamat Kamu Berhasil ! :-)";
        }
        else{
            hasil = "Maaf Kamu Belum Berhasil ! :-(";
        }

        JOptionPane.showMessageDialog(null, "Nilai Rata - Rata Anda : " + avg);
        JOptionPane.showMessageDialog(null, hasil); 
    }
}
