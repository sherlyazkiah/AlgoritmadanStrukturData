package UAS;

class Transaksi {
    int kode;
    String nomorTNKB;
    String namaPemilik;
    int nominal;
    int denda;

    public Transaksi(int kode, String nomorTNKB, String namaPemilik, int nominal, int denda) {
        this.kode = kode;
        this.nomorTNKB = nomorTNKB;
        this.namaPemilik = namaPemilik;
        this.nominal = nominal;
        this.denda = denda;
    }

    public String toString() {
        return String.format("| %-4d | %-10s | %-10s | %-7d | %-6d |",
                kode, nomorTNKB, namaPemilik, nominal, denda);
    }
}