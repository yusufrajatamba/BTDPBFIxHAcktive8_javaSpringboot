import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        //deklarasi

        boolean running =true;
        int counter =0;
        String jawab;
        Scanner scan= new Scanner(System.in);

        while(running){
            System.out.println("Apakah Anda Ingin keluar : ");
            System.out.println("Tentukan Pilihan anda [ya/tidak] : ");

            jawab = scan.nextLine();

            //check jawabannya;
            if(jawab.equalsIgnoreCase("yes")){
                running = false;
            }else
            running =false;

            counter ++;
        }
     
        
        System.out.println(counter);

        scan.close();
    }



    
}
