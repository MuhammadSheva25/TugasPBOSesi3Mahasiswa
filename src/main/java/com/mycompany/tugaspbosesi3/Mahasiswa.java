/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbosesi3;

/**
 *
 * @author Muhammad Sheva
 */
public class Mahasiswa {
    String nim;
    String nama;
    int nilai;

    Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    String hitungGrade() {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 70 && nilai <= 79) {
            return "B";
        } else if (nilai >= 60 && nilai <= 69) {
            return "C";
        } else if (nilai >= 50 && nilai <= 59) {
            return "D";
        } else if (nilai >= 0 && nilai < 50) {
            return "E";
        } else {
            return "Input nilai anda salah";
        }
    }
}


