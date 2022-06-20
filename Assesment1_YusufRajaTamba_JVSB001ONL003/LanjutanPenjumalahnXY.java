//package AssignmentSesi3;

import java.util.Scanner;

public class LanjutanPenjumalahnXY {
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
        System.out.println("Ini hasil Latihan 5B.1 - B.3 ");
        

        //ini Latihan 5 B.1
        System.out.println("Cek boolean x1>=x2 = " + (x1>=x2));
        //ini Latihan 5 B.2
        System.out.println("Cek boolean x2>=x1 = " + (x2>=x1));
        
        //ini latihan 5 B.3
        
        //if dibawah berfungsi untuk menetralisir nilai x1 dan x2 agar ketika dilakukan operasi mod hasilnya 1
        if(x1%4!=1 ){
            x1++;
            
        }
        if(x2%5!=0){
            x2-=x2;
        }
        System.out.println("Cek boolean X1 mod 4 == ++x2 mod 5 = " + ((x1%4)==((++x2%5))));



    }
    
}
