package modul_2.latihan.latihan_5;

public class Main {
    public static void main(String[] args) {
        // Object dengan default constructor
        Barang barang1 = new Barang();
        barang1.tampilkanInfo();

        // Object dengan parameterized constructor
        Barang barang2 = new Barang("Laptop", 7500000);
        barang2.tampilkanInfo();
    }
}
