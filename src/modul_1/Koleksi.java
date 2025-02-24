package modul_1;

public class Koleksi {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        String[] mahasiswa = {"andi", "budi"};

        System.out.println(number[1]);
        System.out.println(mahasiswa[1]);

        int jumlah = number.length;
        System.out.println(jumlah);

        for (int j : number) {
            System.out.println(j);
        }
    }
}
