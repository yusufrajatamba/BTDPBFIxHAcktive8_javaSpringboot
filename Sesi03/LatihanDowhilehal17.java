import java.util.Scanner;

import java.util.Scanner;

public class LatihanDowhilehal17 {

    public static void main(String[] args) {
        int counter =0;
        int jumlah;
        Scanner inputan = new Scanner(System.in);

        System.out.println("Masukkan Jumlah perulangan :");
        jumlah = inputan.nextInt();
        System.out.println("");

        do{
            
            System.out.println("ini adalah perulangan ke-" + counter);

            counter++;
        }while(counter<=jumlah);

        inputan.close();
    }
    
    
}
