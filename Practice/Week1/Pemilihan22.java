package Week1;
import java.util.Scanner;

public class Pemilihan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        float tugas = sc.nextFloat();
        System.out.print("Masukkan Nilai Kuis: ");
        float kuis = sc.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        float uts = sc.nextFloat();
        System.out.print("Masukkan Nilai UAS: ");
        float uas = sc.nextFloat();
        System.out.println("==============================");
        System.out.println("==============================");

        float nilaiAkhir = (tugas*0.2f) + (kuis*0.2f) + (uts*0.3f) + (uas*0.4f);

        if(tugas<0 || tugas>100 || kuis<0 || kuis>100 || uts<0 || uts>100 || uas<0 || uas>100) {
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");

        } else {
            System.out.println("Nilai Akhir: " + nilaiAkhir);

            if(nilaiAkhir>80 && nilaiAkhir<=100) {
                System.out.println("Nilai Huruf: A");
            } else if(nilaiAkhir>73 && nilaiAkhir<=80) {
                System.out.println("Niali Huruf: B+");
            } else if(nilaiAkhir>65 && nilaiAkhir<=73) {
                System.out.println("Niali Huruf: B");
            } else if(nilaiAkhir>60 && nilaiAkhir<=65) {
                System.out.println("Niali Huruf: C+");
            } else if(nilaiAkhir>50 && nilaiAkhir<=60) {
                System.out.println("Niali Huruf: C");
            } else if(nilaiAkhir>39 && nilaiAkhir<=50) {
                System.out.println("Niali Huruf: D");
            } else if(nilaiAkhir>=0 && nilaiAkhir<=39) {
                System.out.println("Niali Huruf: E");
            }

            System.out.println("==============================");
            System.out.println("==============================");

            if (nilaiAkhir>50 && nilaiAkhir<=100) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }  
        }

        sc.close();
    }
}