import java.util.Scanner;

public class CekGraduation {

    public static void main(String[] args) {
        //membuat variabel dan scanner

    int nilai;
    String nama;
    Scanner scan = new Scanner(System.in);

    //mengambil input
    System.out.print(" Nama: ");
    nama = scan.next();
    System.out.print("Nilai: ");
    nilai = scan.nextInt();

    //melakukan fungsi if untuk check lulus atau enggak
    
    if(nilai>=75){
        System.out.format("Selamat %s Anda Lulus dengan Nilai : %d", nama, nilai);

    }else{
        System.out.println("Maaf," + nama + " anda Gagal. Berusaha lebih keras lagi ya !");
    }




    }
    
}
