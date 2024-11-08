import java.util.Scanner;

public class Siakad_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah mahasiswa : ");
        int mhs = sc.nextInt();
        System.out.print("Masukkan Jumlah mata kuliah : ");
        int matkul = sc.nextInt();
        sc.nextLine();

        int[][] nilai = new int[mhs][matkul];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            
            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        }
        
        System.out.println("\n=====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
        }
        
    }
}