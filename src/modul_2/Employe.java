package modul_2;

public class Employe {
    private String nama;
    private double gaji;
    private double bonus;

    // Constructor
    public Employe(String nama, double gaji, double bonus) {
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }

    public void kerja() {
        System.out.println(nama + " sedang bekerja sebagai Employee");
    }

    public double getBersih() {
        return this.gaji + this.bonus; // Mengembalikan total gaji bersih
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: Rp" + String.format("%,.0f", gaji));
        System.out.println("Bonus: Rp" + String.format("%,.0f", bonus));
        System.out.println("Total Gaji Bersih: Rp" + String.format("%,.0f", getBersih()));
    }

    public static void main(String[] args) {
        Employe employe1 = new Employe("Lia Amanda", 10000000, 10000000 * 0.5);
        employe1.tampilkanInfo();
    }
}