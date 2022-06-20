import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

     
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input Angka-2: ");
        angka2 = keyboard.nextInt();
        

        //Operasi penjumlahan
        hasil = angka1+angka2;
        System.out.println("Hasil = " + hasil);



        System.out.println("Input Angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input Angka-2: ");
        angka2 = keyboard.nextInt();

        
        //Operasi pengurangan
        hasil = angka1-angka2;
        System.out.println("Hasil = " + hasil);

        System.out.println("Input Angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input Angka-2: ");
        angka2 = keyboard.nextInt();

        
        //Operasi perkalian
        hasil = angka1*angka2;
        System.out.println("Hasil = " + hasil);

        System.out.println("Input Angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input Angka-2: ");
        angka2 = keyboard.nextInt();

        
        //Operasi Hasil Bagi
        hasil = angka1%angka2;
        System.out.println("Hasil = " + hasil);


    }
    
}
