import javax.naming.spi.DirObjectFactory;

public class MaxNumber {
    static double maxNumber (double a, double b){
        //method sama param beda
        //tipe data double

        if(a>b){
            return a;
        }else return b;
    }
    


static int maxNumber(int a,int b){

    //method sama parameter berbeda
    //tipe data double

    if(a>b)return a;
    else return b;

}
 public static void main(String[] args) {
    System.out.println(maxNumber(10, 20));
    System.out.println(4.5);
 }
}

