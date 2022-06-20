import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class DiskondanHargaBayar {
    public static void main(String[] args) {
        int harga;
        double totaldiskon,total;
        double diskon = 0.1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Pembelian Anda : ");
        harga = scan.nextInt();
        if (harga >= 1000000) {
            totaldiskon = harga * diskon;
            total = harga-totaldiskon;

            System.out.println("Total Harga Belanjaan Anda : Rp. " + total);
        }else 
        System.out.println("Total Harga Belanjaan Anda : Rp. " + harga);

    }

}
