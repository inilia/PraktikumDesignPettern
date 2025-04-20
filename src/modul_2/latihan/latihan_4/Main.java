package modul_2.latihan.latihan_4;

public class Main {
    public static void main(String[] args) {
        // Membuat object Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // Mengisis nilai menggunakan setter
        mhs.setNama("Lia Amanda");
        mhs.setNim("2023573010026");

        // Menampilkan nilai menggunakan getter
        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Nim Mahasiswa: " + mhs.getNim());

    }
}
