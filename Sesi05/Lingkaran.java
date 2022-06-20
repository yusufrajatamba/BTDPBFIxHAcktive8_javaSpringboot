import java.util.Scanner;

public class Lingkaran extends bangundatar {

    double r;
    double pi = 3.14;
    double luasl;
    double kelilingl;
    Scanner scan = new Scanner(System.in);

    void hitungluasdankel() {
        System.out.print("Masukkan nilai r : ");
        r = scan.nextInt();

        luasl = pi * r * r;
        kelilingl = 2 * pi * r;

        System.out.println("Luas lingkaran        : " + luasl);
        System.out.println("keliling Lingkaran    : " + kelilingl);

    }

}
