package modul_2.latihan.latihan_3;

public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank(100000);

        akun.tampilkanSaldo(); // Ini boleh ✔️

        // Coba akses langsung atribut saldo
        // System.out.println("Saldo: " + akun.saldo); ❌ ERROR!
    }
}
