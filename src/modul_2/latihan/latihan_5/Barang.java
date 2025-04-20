package modul_2.latihan.latihan_5;

public class Barang {
    String namaBarang;
    double harga;

    // Default constructor
    public Barang() {
        namaBarang = "Belum ada nama";
        harga = 0.0;

    }

    // Parameterized constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;

    }

    // Method untuk menampilkan data barang
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: Rp " + harga);
        System.out.println();

    }
}
