import java.util.Scanner;

public class Hadiah {

    public static void main(String[] args) {
        int belanja =0;

        Scanner scan = new Scanner(System.in);


        System.out.print("Total Belanja : Rp.");
        belanja = scan.nextInt();

        if(belanja>10000){
            System.out.println("Selamat Anda Mendapatkan Hadiah");
        }else {
        System.out.println("Jumlah Belanja Anda Masih kurang untuk claim hadiah");
        }

        System.out.println("Terimakasih Telah Belanja di Toko Kami");  
    }
         
}
