import java.util.Scanner;
public class Porseni13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int badminton = 1, tenisMeja = 1, basket = 1, bolaVoly = 1;
        String allBadminton = "", allTenisMeja = "", allBasket = "", allBolaVoly = "", kategori, namaAtlet;

        while (true) {
            System.out.print("Masukkan kategori cabang olahraga (ketik 'keluar' untuk selesai): ");
            kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("keluar")) {
                System.out.println("\nDaftar Nama Atlet Badminton : ");
                System.out.print(allBadminton);
                System.out.println("\nDaftar Nama Atlet Tenis Meja : ");
                System.out.print(allTenisMeja);
                System.out.println("\nDaftar Nama Atlet Basket : ");
                System.out.print(allBasket);
                System.out.println("\nDaftar Nama Atlet Bola Voly : ");
                System.out.print(allBolaVoly);
                break;
            }

            if (kategori.equalsIgnoreCase("badminton")) {
                System.out.println("Masukkan nama atlet Badminton: ");
                while (badminton <= 5) {
                    System.out.print("Atlet " + badminton + ": ");
                    namaAtlet = sc.nextLine();
                    allBadminton += "Atlet " + badminton + ": " + namaAtlet + "\n";
                    badminton++;
                }
            } else if (kategori.equalsIgnoreCase("tenis meja")) {
                System.out.println("Masukkan nama atlet Tenis Meja: ");
                while (tenisMeja <= 5) {
                    System.out.print("Atlet " + tenisMeja + ": ");
                    namaAtlet = sc.nextLine();
                    allTenisMeja += "Atlet " + tenisMeja + ": " + namaAtlet + "\n";
                    tenisMeja++;
                }
            } else if (kategori.equalsIgnoreCase("basket")) {
                System.out.println("Masukkan nama atlet Basket: ");
                while (basket <= 5) {
                    System.out.print("Atlet " + basket + ": ");
                    namaAtlet = sc.nextLine();
                    allBasket += "Atlet " + basket + ": " + namaAtlet + "\n";
                    basket++;
                }
            } else if (kategori.equalsIgnoreCase("bola voly")) {
                System.out.println("Masukkan nama atlet Bola Voly: ");
                while (bolaVoly <= 5) {
                    System.out.print("Atlet " + bolaVoly + ": ");
                    namaAtlet = sc.nextLine();
                    allBolaVoly += "Atlet " + bolaVoly + ": " + namaAtlet + "\n";
                    bolaVoly++;
                }
            } else {
                System.out.println("Kategori olahraga tidak dikenal. Silakan masukkan kategori yang benar.");
            }
        }
        sc.close();
    }
}
