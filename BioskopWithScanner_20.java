import java.util.Scanner;
public class BioskopWithScanner_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama,next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
        
            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama :");
                    nama = sc.nextLine();

                    while (true) {
                        while (true) {
                            System.out.print("Masukkan baris :");
                            baris = sc.nextInt();
                            sc.nextLine();
                            if (baris < 1 || baris > 4) {
                                System.out.println("Nomor baris tidak tersedia.");
                                continue;
                            } else {
                                break;
                            }
                        }
    
                        while (true) {
                            System.out.print("Masukkan kolom :");
                            kolom = sc.nextInt();
                            sc.nextLine();
                            if (kolom < 1 || kolom > 2) {
                                System.out.println("Nomor kolom tidak tersedia.");
                                continue;
                            } else {
                                break;
                            }
                        }
    
                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                            continue;                    
                        }
                        break;
                    }
                    
                    penonton[baris-1][kolom-1] = nama;
        
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        
    }
}
