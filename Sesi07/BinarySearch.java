/*
 * @author : Yusuf Raja Tamba
 * Program untuk mencari data dengan mengurutkan data array terlebih dahulu
 * menggunakan fungsi while sebagai pengulangan
 */
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int c,first,last,midle,n,search, array [];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of Elements");

        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + " intergers");
        for (c = 0; c < n;c++)
        array[c] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();
        first  = 0;
        last   = n-1;
        midle  = (first + last)/2;
        while( first <= last)
        {
            if ( array[midle] < search)
                first = midle + 1;
            else if ( array[midle] == search)
            {
                System.out.println(search + " found at location " + (midle + 1) + ".");
                break;
            }
            else
                last = midle -1;
                midle= (first + last)/2;
        }
        if ( first > last)
            System.out.println(search + " is not present in the list.\n");
    }
    
}
