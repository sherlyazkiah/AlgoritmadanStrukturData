package UAS;

class Kendaraan {
    String nomorTNKB;
    String namaPemilik;
    String jenis;
    int ccKendaraan;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String nomorTNKB, String namaPemilik, String jenis, int ccKendaraan, int tahun, int bulanHarusBayar) {
        this.nomorTNKB = nomorTNKB;
        this.namaPemilik = namaPemilik;
        this.jenis = jenis;
        this.ccKendaraan = ccKendaraan;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    public String toString() {
        return String.format("| %-10s | %-10s | %-5s | %-10d | %-4d | %-17d |",
                nomorTNKB, namaPemilik, jenis, ccKendaraan, tahun, bulanHarusBayar);
    }

    public void printTransaksi() {
        throw new UnsupportedOperationException("Unimplemented method 'printTransaksi'");
    }
}
