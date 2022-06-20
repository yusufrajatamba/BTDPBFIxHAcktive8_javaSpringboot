import java.util.Scanner;

public class LatihanWhilehal17 {
    public static void main(String[] args) {
        
        int counter=0;
        int inputan;
        Scanner masuk = new Scanner(System.in);

        System.out.println("ini adalah Aplikasi perulangan: ");
        System.out.println("Masukkan Jumlah perulangan : ");
        inputan = masuk.nextInt();

        while(counter <=inputan){
            System.out.println("Perulangan ke-" + counter);

            counter++;

        }
        masuk.close();
    }
    
}
