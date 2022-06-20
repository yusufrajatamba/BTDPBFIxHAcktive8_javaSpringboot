import java.util.Scanner;

public class CheckNilaiRatarata {

    public static void main(String[] args) {

        int input;
        int x, y, z, terbesar,terkecil;
        Scanner scan = new Scanner(System.in);

        System.out.println("Menentukan Bilangan terbesar,terkecil dan Rata-rata");
        System.out.println("Masukkan bilangan Pertama (X) : ");
        x = scan.nextInt();
        System.out.println("Masukkan bilangan Pertama (Y) : ");
        y = scan.nextInt();
        System.out.println("Masukkan bilangan Pertama (Z) : ");
        z = scan.nextInt();

        int hasil = (x + y + z) / 3;
        ratarataclass testrat = new ratarataclass();

        if (x > y && x > z) {
            terbesar = z;
        } else {
            if (y > z) {
                terbesar = y;
            } else {
                terbesar = z;
            }

        }

        if (x < y && x < z) {
            terkecil = x;
        } else {
            if (y < z) {
                terkecil = y;
            } else {
                terkecil = z;
            }

        }

        System.out.println("Hasil : ");
        System.out.print("Rata-ratanya adalah : ");
        testrat.rata(x, y, z);
        System.out.println("Bilangan terbesar adalah " + terbesar);
        System.out.println("Bilangan terbesar adalah " + terkecil);

    }

}
