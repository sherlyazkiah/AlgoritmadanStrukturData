package UAS;

import java.util.Scanner;

public class KendaraanMain {
    private static Kendaraan[] daftarKendaraan = new Kendaraan[4];
    private static Transaksi[] daftarTransaksi = new Transaksi[10];
    private static int transaksiCount = 0;
    private static int totalPendapatan = 0;

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//parameter untuk menampilkann daftar kendaraan (menu no 1)
        daftarKendaraan[0] = new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        daftarKendaraan[1] = new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        daftarKendaraan[2] = new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        daftarKendaraan[3] = new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

// perulangan untuk switch case manu agar tetap berulang sapai memilih kelua 
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi berdasarkan nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");

            int choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    tampilkanDaftarKendaraan();
                    break;
                case 2:
                    bayarPajak(sc);
                    break;
                case 3:
                    tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    urutkanTransaksiBerdasarkanNamaPemilik();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
//menampilkan daftar kendaraan yang telah diinisialisasi pada array dengan parameter 
    private static void tampilkanDaftarKendaraan() {
        System.out.println("===================================================================================");
        System.out.println("| Nomor TNKB | Nama Pemilik | Jenis | CC kendaraan | Tahun | Bulan harus Bayar |");
        System.out.println("===================================================================================");
        for (Kendaraan k : daftarKendaraan) {
            System.out.println(k);
        }
        System.out.println("===================================================================================");
    }

//perhitungan tarnsaksi bayar pajak 
    private static void bayarPajak(Scanner scanner) {
        System.out.print("Masukkan Nomor TNKB: ");
        String nomorTNKB = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < daftarKendaraan.length; i++) {
            Kendaraan k = daftarKendaraan[i];
            if (k.nomorTNKB.equalsIgnoreCase(nomorTNKB)) {
                System.out.print("Masukkan Nominal Pembayaran: ");
                int nominal = scanner.nextInt();
                System.out.print("Masukkan Denda (jika ada): ");
                int denda = scanner.nextInt();
                scanner.nextLine(); 
                
                daftarTransaksi[transaksiCount] = new Transaksi(transaksiCount + 1, k.nomorTNKB, k.namaPemilik, nominal, denda);
                transaksiCount++;
                totalPendapatan += (nominal + denda);

                System.out.println("Pajak untuk kendaraan dengan Nomor TNKB " + nomorTNKB + " telah dibayar.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kendaraan dengan Nomor TNKB " + nomorTNKB + " tidak ditemukan.");
        }
    }

//menampilkan seluruh data yang sudah diinput sebelumnya 
    private static void tampilkanSeluruhTransaksi() {
        System.out.println("Daftar Transaksi Pembayaran Pajak");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| Kode | TNKB       | Nama      | Nominal | Denda |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < transaksiCount; i++) {
            System.out.println(daftarTransaksi[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Semua transaksi berhasil dicetak");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("TOTAL PENDAPATAN");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Pendapatan hari ini : " + totalPendapatan);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }

//mengurutkan atau sorting menggunakan bubble sort 
    private static void urutkanTransaksiBerdasarkanNamaPemilik() {
        for (int i = 0; i < transaksiCount - 1; i++) {
            for (int j = i + 1; j < transaksiCount; j++) {
                if (daftarTransaksi[i].namaPemilik.compareTo(daftarTransaksi[j].namaPemilik) > 0) {
                    Transaksi temp = daftarTransaksi[i];
                    daftarTransaksi[i] = daftarTransaksi[j];
                    daftarTransaksi[j] = temp;
                }
            }
        }
        tampilkanSeluruhTransaksi();
    }
}