package UtsPemrograman;
import java.util.Scanner;

public class DataDanIpk {
    public static void main(String[]args) {
        String nama,smstr,jrsn;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Semester : ");
        smstr = scanner.nextLine();
        System.out.print("Jurusan : ");
        jrsn = scanner.nextLine();
        System.out.print("Nilai OOP : ");
        double nilaioop = scanner.nextInt();
        System.out.print("Nilai Basis Data : ");
        double nilaibd = scanner.nextInt();
        System.out.print("Nilai Jaringan Komputer : ");
        double nilaijk = scanner.nextInt();
        
        double ip,totalNilaiMk;
        totalNilaiMk = nilaioop + nilaibd + nilaijk;
        ip = totalNilaiMk / 3;
               
        System.out.println("============================================");
        System.out.println("Nama : " + nama);
        System.out.println("Semester : " + smstr);
        System.out.println("Jurusan : " + jrsn);
        System.out.println("Nilai OOP : " + nilaioop);
        System.out.println("Nilai Basis Data : " + nilaibd);
        System.out.println("Nilai Jaringan Komputer : " + nilaijk);
        System.out.println("Total Nilai Kuliah : " + totalNilaiMk);
        System.out.println("Indeks Prestasi : " + ip);
        
        String predikat;
        if (ip > 81 && ip <100) {
            predikat = "A";
        }
        else if (ip >61 && ip <80) {
            predikat = "B";
        }
        else {
            predikat = "C";
        }
        System.out.println("SELAMAT ANDA MENDAPATKAN PREDIKAT : " + predikat);
    }
}
