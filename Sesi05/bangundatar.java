import java.util.Scanner;

public class bangundatar {
    public static void main(String[] args) {

        int input;
        Scanner scan = new Scanner(System.in);
        Persegiclass inipersegi = new Persegiclass();
        PersegiPanjang inipersegipanjang = new PersegiPanjang();
        Lingkaran iniLingkaran = new Lingkaran();
        Segitiga iniSegitiga = new Segitiga();

        System.out.println("Masukin Bangun data yang akan di check : ");
        System.out.println("1. Persegi          : ");
        System.out.println("2. Persegipanjang   : ");
        System.out.println("3. Lingkaran        : ");
        System.out.println("4. Segitiga         : ");

        input = scan.nextInt();

        if (input == 1) {
            inipersegi.hitungluasdankel();
        } else if (input == 2) {
            inipersegipanjang.hitungluasdankel();
        } else if (input == 3) {
            iniLingkaran.hitungluasdankel();
        } else if (input == 4) {
            iniSegitiga.hitungluasdankel();
        } else {
            System.out.println("Masukkan Nilai yang benar");
        }
    }
}
