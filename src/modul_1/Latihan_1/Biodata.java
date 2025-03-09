package modul_1.Latihan_1;

import java.time.LocalDate;

public class Biodata {
    public static void main(String[] args) {

        String namaLengkap = "Lia Amanda";
        String tempatLahir = "Lhokseumawe";
        LocalDate tanggalLahir = LocalDate.of(2004,12,29);
        String golonganDarah = "O";
        int umur = 20;
        double tinggiBadan = 1.55;
        char jenisKelamin = 'P';
        String agama = "Islam";
        String pekerjaan = "Mahasiswa";

        System.out.println("=== Data Diri ===");
        System.out.println("Nama Lengkap   : " + namaLengkap);
        System.out.println("Tempat Lahir   : " + tempatLahir);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Golongan Darah : " + golonganDarah);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Tinggi Badan   : " + tinggiBadan + " m");
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Agama          : " + agama);
        System.out.println("Pekerjaan      : " + pekerjaan);
    }
}