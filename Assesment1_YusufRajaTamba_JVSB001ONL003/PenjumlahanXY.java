//package AssignmentSesi3;

import java.util.Scanner;

public class PenjumlahanXY {
    public static void main(String[] args) {
        int x1,x2;
        int y1;
        int y2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ini Program Latihan 5 A dan B ");
        System.out.println("Masukkan Nilai y1 : ");
        y1=scan.nextInt();
        System.out.println("Masukkan Nilai y2 : ");
        y2=scan.nextInt();

        //ini latihan 5 A.1
        System.out.println(" ");
        System.out.println("Ini Hasil dari Latihan 5A.1 ");
        x1 = (y1+y2)*(y1+y2);
        System.out.println("hasil dari X1 = (y1 + y2) * (y1+y2)  = " + x1);

        //ini latihan 5 A.2
        System.out.println("Ini Hasil dari Latihan 5A.2 ");
        x2 = (y1%4)*y2;
        System.out.println("hasil dari X2 = (y1 %  4) * (y2)     = " + x2);
        System.out.println(" ");
     


    }
    
}
