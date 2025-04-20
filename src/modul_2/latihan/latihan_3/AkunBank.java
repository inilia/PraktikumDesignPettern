package modul_2.latihan.latihan_3;

public class AkunBank {
    private double saldo; // Atribut private

    // Constructor
    public AkunBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Method public untuk menampilkan saldo
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}