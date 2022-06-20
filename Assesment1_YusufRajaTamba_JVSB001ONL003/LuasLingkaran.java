// package AssignmentSesi3;
 
 import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        
        double Luas;
        double Pi = 3.14;
        int r;
        Scanner input = new Scanner(System.in);

        //mengambil hasil input

        System.out.println("Menghitung Luas Lingkaran (Pi=3.14");
        System.out.println("Masukkan nilai r :");
        r = input.nextInt();

        Luas = Pi*r*r;

        System.out.println("Luas lingkaran adalah (Pi * r *r) = " + Luas);
       
        input.close();

    }
    
}
