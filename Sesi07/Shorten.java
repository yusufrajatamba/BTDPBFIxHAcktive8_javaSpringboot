import java.io.*;
import java.util.Scanner;
public class Shorten
{ 
    public static void main(String args[])throws Exception
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		
		int s;
		System.out.print("Jumlah Bilangan  : ");
		s = Integer.parseInt(dataIn.readLine());
		
		int[] Array;
		Array=new int[s];
		int asc;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<s;i++)
		{ 
			System.out.print("Nilai " +(i+1)+" = ");
			Array[i]=Integer.parseInt(input.next()); 
		}

		for(int c=1;c<s;c++)
		{ 
			for(int d=0;d<s-c;d++)
			{ 
				if(Array[d]>Array[d+1])
				{ 
					asc=Array[d];
					Array[d]=Array[d+1];
					Array[d+1]=asc; 
				} 
			} 
		}
		
		System.out.println("");
		System.out.println("Hasil Pengurutan Adalah ");
		for(int i=0;i<s;i++)
		{
			System.out.print(" "+ Array[i]);
		} 
	} 
}