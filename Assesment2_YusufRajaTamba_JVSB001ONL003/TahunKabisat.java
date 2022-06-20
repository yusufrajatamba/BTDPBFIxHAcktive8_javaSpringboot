import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
     
        int tahun;
        int Checktahun;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Tahun yang akan di check : ");
        tahun=scan.nextInt();
        
    if(tahun%100==0 && tahun%400!=0){
         System.out.println("Tahun " + tahun +" Bukan Tahun Kabisat");
    }
    else if(tahun %4==0 || tahun%400==0){
        System.out.println("Tahun " + tahun + " adalah Tahun Kabisat");
    }
    else
        System.out.println("Tahun " + tahun +" Bukan Tahun Kabisat");
    
    
    }

}
