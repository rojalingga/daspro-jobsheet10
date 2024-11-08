import java.util.Scanner;

public class Tugas_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] hasilSurvei = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Masukkan nilai untuk pertanyaan " + (j + 1) + " (1-5): ");
                hasilSurvei[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Rata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += hasilSurvei[i][j];
            }
            double rata2Responden = (double) total / 6;
            System.out.println("Responden " + (i + 1) + " : " + rata2Responden);
        }
        System.out.println();

        System.out.println("Rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += hasilSurvei[i][j];
            }
            double rata2Pertanyaan = (double) total / 10;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rata2Pertanyaan);
        }
        System.out.println();

        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (10 * 6);
        System.out.println("Rata-rata keseluruhan : " + rataRataKeseluruhan);

    }
}
