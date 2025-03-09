package modul_1.Latihan_1;

public class GanjilDoWhile {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil dari 1 hingga 20 (do-while-loop):");
        int i = 1;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
    }
}