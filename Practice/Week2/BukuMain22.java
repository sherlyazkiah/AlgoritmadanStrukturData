package Week2;

public class BukuMain22 {

    public static void main(String[] args) {
        
        Buku22 bk1 = new Buku22();
        bk1.judul = "Todays Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();;
        bk1.terjual(5);
        System.out.println("Harga yang terjual = " + bk1.hitungHargaTotal(5));
        System.out.println("Diskon = " + bk1.hitungDiskon(5));
        System.out.println("Bayar = " + bk1.hitungHargaBayar(5));
        bk1.stok = bk1.stok - 5;
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        Buku22 bk2 = new Buku22("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        System.out.println("Harga yang terjual = " + bk2.hitungHargaTotal(5));
        System.out.println("Diskon = " + bk2.hitungDiskon(5));
        System.out.println("Bayar = " + bk2.hitungHargaBayar(5));
        bk2.stok = bk2.stok - 11;
        bk2.tampilInformasi();

        Buku22 bkSherly = new Buku22("One of Us Is Lying", "Karen M. McManus", 368, 15, 79000);
        bkSherly.terjual(5);
        System.out.println("Harga yang terjual = " + bkSherly.hitungHargaTotal(5));
        System.out.println("Diskon = " + bkSherly.hitungDiskon(5));
        System.out.println("Bayar = " + bkSherly.hitungHargaBayar(5));
        bkSherly.stok = bkSherly.stok - 5;
        bkSherly.tampilInformasi();
    }
}
