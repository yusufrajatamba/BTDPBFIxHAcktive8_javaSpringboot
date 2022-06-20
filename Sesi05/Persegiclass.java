import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

public class Persegiclass extends bangundatar {

    double sisi;
    double luasb;
    double kelilingb;
    Scanner scan = new Scanner(System.in);

    void hitungluasdankel() {

        System.out.print("Masukkan nilai sisi : ");
        sisi = scan.nextInt();

        luasb = sisi * sisi;
        kelilingb = 4 * sisi;
        System.out.println("Luas Persegi :" + luasb);
        System.out.println("Keliling Persegi :" + kelilingb);

    }

}
