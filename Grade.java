/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author brahm
 */
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

      
        double nilaiAkhir = (0.20 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);

     
        String grade;
        if (nilaiAkhir > 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75 && nilaiAkhir <= 84) {
            grade = "B";
        } else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
            grade = "C";
        } else if (nilaiAkhir >= 49 && nilaiAkhir <= 64) {
            grade = "D";
        } else {
            grade = "E";
        }

       
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

        
    }
}
