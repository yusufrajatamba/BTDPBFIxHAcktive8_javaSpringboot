import java.util.Scanner;

public class itprofesi {

    public static void main(String[] args) {
        String [] Itprofessi = new String [5];
        String  penampil ;
        boolean tes = true;

        Scanner neww = new Scanner(System.in);
        Scanner penam = new Scanner(System.in);

        for(int counter =0; counter < Itprofessi.length; counter++){

            System.out.println(" Masukkan Profesi dalam duia IT sebanyak 5 : ");
            Itprofessi [counter] = neww.nextLine();
        }

        System.out.println(" ---------- ");
        System.out.println("Tampilkan Isi array ? (yes/no) : ");
        penampil = neww.nextLine();

        if(penampil.equalsIgnoreCase("yes")){
            for(String tampil : Itprofessi){
                System.out.println("Data Array anda adalah : " + tampil);
            }
            
        }else{
            System.out.println("terimakasih..");

        }
    

        }
    }
    

