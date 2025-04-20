package modul_2;

public class Mahasiswa {
    private String nama;
    private String alamat;
    private String kelas;
    private String noInduk;

    // Konstruktor
    public Mahasiswa(String nama, String alamat, String kelas, String noInduk) {
        this.nama = nama;
        this.alamat = alamat;
        this.kelas = kelas;
        this.noInduk = noInduk;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNoInduk() {
        return noInduk;
    }

    // Metode untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Kelas: " + kelas);
        System.out.println("No Induk: " + noInduk);
    }
}