import java.util.Scanner;

public class LampuLalulintas {
    public static void main(String[] args) {
     
        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inputkan Warna lampu : ");
        lampu = scan.next();

        switch(lampu){
            case "merah" :
            System.out.println("Lampu Merah, Berhenti!");
            break;
            case "kuning" :
            System.out.println("Lampu kuning, berhati-hati");
            break;
            case "hijau" :
            System.out.println("Lampu Hijau, Silahkan Jalan ");
            break;
            default :
            System.out.println("Warna Lampu salah !" );


        }
    }
}
