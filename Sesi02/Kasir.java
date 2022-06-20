import java.util.Scanner;

public class Kasir {

    public static void main(String[] args) {
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Masukkan Total belanjaan: ");
        belanjaan = scan.nextInt();
        System.out.println("Apakah ada kartu member ? : ");
        kartu = scan.next();

        //proses
        if (kartu.equalsIgnoreCase ("ya")){
            if (belanjaan>=500000){
                diskon = 50000;
            }else if (belanjaan >=100000){
                diskon = 15000;
            }
            else{
                diskon = 0;
            }
        }
        else{   
            if(belanjaan>100000){
                diskon = 5000;
            }else{
                diskon =0;
            }
                }

        bayar = belanjaan - diskon;
               
        System.out.println("Total Belanjaan Anda : " + belanjaan);
        System.out.println(" Potongan diskon sebesar :" +diskon);
        System.out.println(" Total Pembayaraan Anda sebesar : " + bayar);
        
    }

     
    
    
}
    

