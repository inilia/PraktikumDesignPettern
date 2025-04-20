package modul_4.praktikum_1.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {
    private final String content;

    public ReportManager(String content) {
        this.content = content;
    }

    // Membuat laporan
    public String generateReport() {
        return "=== LAPORAN ===\n" + content + "\n===================";
    }

    // Menyimpan laporan ke file (Seharusnya tugas kelas lain)
    public void saveToFile(String filenama) {
        String folderPath = "src\\modul_4\\srp\\praktikum_1\\tanpa_srp";

        File file = new File(folderPath + filenama);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Laporan disimpan ke file: " + filenama);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan laporan: " + e.getMessage());
        }
    }

    // Mencetak laporan ke console (Seharusnya kelas lain)
    public void printReport() {
        System.out.println("\nLaporan yang dicetak:\n" + content);
    }
}