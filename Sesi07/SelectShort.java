/*
 * @author : Yusuf Raja Tamba
 * Program untuk mencari posisi nilai untuk mempermudah pencarian data
 * menggunakan fungsi while sebagai pengulangan
 */
import java.util.Scanner;

public class SelectShort {

    public static void main(String[] args) {
        //buat object Scanner

        Scanner scan = new Scanner(System.in);

        //input jumlah Data

        System.out.print("Masukkan Jumlah Data : "); 
        int jlh_data = scan.nextInt();

        //input nilai tiap Data
        int [] data = new int[jlh_data];
        System.out.println();
        
        for(int x=0;x<jlh_data;x++){
            System.out.print("Masukkan nilai Data ke-"+ (x+1)+ "  : ");
            data[x]=scan.nextInt();
        }

        // Tampilkan Data Sebelum di sorting
        System.out.println();
        System.out.print("Data Sebelum di Sorting : ");
        for(int x=0;x<jlh_data;x++)
            System.out.print(data[x] + " ");
        
        //Proses selection Sort
        System.out.println("\n\n Proses Selection Sort");
        for(int x=0;x<jlh_data;x++)
        {
            System.out.println("iterasi Ke-"+ (x+1)+ " ");
            for(int y=0;y<jlh_data;y++)
                System.out.print(data[y]+ " ");
        
        System.out.print("Apakah data " + data[x] + " sudah benar pada urutannya? ");
        System.out.println("");

        boolean tukar =false;
        int index =0;
        int min = data[x];
        String pesan = " Tidak ada Pertukaran";
        for(int y=x+1;y<jlh_data;y++){
            if(min>data[y]){
                tukar=true;
                index=y;
                min = data[y];
            }
        }
        if(tukar==true){
            // Pertukaran data
            pesan= " Data " + data[x] + " ditukar dengan Data " + data[index];
            int temp = data[x];
            data[x] = data[index];
            data[index]=temp;

        }
        for(int y=0;y<jlh_data;y++)
            System.out.print(data[y]+ " ");

            System.out.println(pesan + " \n");
    }

        // Tampilkan Data Setelah di Sortung
        System.out.print("Data Setelah di sorting : ");
        for(int x=0;x<jlh_data;x++)
            System.out.print(data[x] + " ");

    }   
}
