//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.js06.java.khalilul_afwan;

/**
 *
 * @author KHALILUL
 */
public class Grade {
    public static void main(String[] args){
        double grade = 92.0;
        
        if (grade >= 90){
            System.out.println("Excellent!");
        }
        /*Untuk menentukan kondisi yang mempunyai nilai rentang maka
        tentukan nilai batas atas dan batas bawah setelah itu digabungkan
        dengan logika AND (&&)*/
        else if((grade < 90) && (grade >= 80)) { // 80 s.d 89
            System.out.println("Good Job!");
        }
        else if((grade < 80) && (grade >= 60)) { // 60 s.d 79
            System.out.println("Study Harder!");
        }
        else {
            System.out.println("Sorry, you failed.");
        }
    }
}
