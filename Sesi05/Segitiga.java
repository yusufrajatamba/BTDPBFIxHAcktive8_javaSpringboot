
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Segitiga extends bangundatar {

    double alas;
    double tinggi;
    double luass;
    double kelilings;
    Scanner scan = new Scanner(System.in);

    void hitungluasdankel() {
        System.out.print("Masukkan nilai alas : ");
        alas = scan.nextInt();
        System.out.print("Masukkan nilai tinggi : ");
        tinggi = scan.nextInt();

        luass = (alas * tinggi) / 2;
        kelilings = (2 * tinggi) + alas;

        System.out.print("Luas Segitiga        : " + luass);
        System.out.print("keliling Segitiga    : " + kelilings);

    }

}
