import java.util.Scanner;

public class PersegiPanjang extends bangundatar {

    double panjang;
    double lebar;
    double luasp;
    double kelilingp;
    Scanner scan = new Scanner(System.in);

    void hitungluasdankel() {

        System.out.print("Masukkan nilai lebar : ");
        panjang = scan.nextInt();
        System.out.print("Masukkan nilai panjang : ");
        lebar = scan.nextInt();

        luasp = panjang * lebar;
        kelilingp = (2 * panjang) + (2 * lebar);

        System.out.println("Luas Persegi Panjang : " + luasp);
        System.out.println("keliling Persegi Panjang : " + kelilingp);

    }

}
