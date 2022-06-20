import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class JualBarang {

  public static void main(String[] args) {
    // inisialisasi variabel
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    int JumlahBeli;
    double totalbayar = 0;
    Scanner scan = new Scanner(System.in);


    //Berikut Menu Barang
      System.out.println("Selamat Datang di Toko Timbul Tenggelam !");
      System.out.println("No. | Nama Produk            | Harga      | 	Diskon "  );
      System.out.println("1.  | Mouse Bluetooth 5.0    | Rp 149.999 | 	10 % "  );
      System.out.println("2.  | Headphone Eksternal    | Rp 246.000 | 	5 % "  );
      System.out.println("3.  | Power Bank 10.000 mAh  | Rp 136000  | 	-  "  );
      System.out.println("4.  | Tripod Kamera          | Rp 267.999 | 	20 % "  );
      System.out.println("5.  | Smart Watch Xiomi      | Rp 899.000 | 	10 % "  );

    


    System.out.println("Apakah Anda ingin berbelanja ? jika ya (jlh > 0 ) ");
    System.out.print("Masukkan Jumlah Pembelian : ");
    JumlahBeli = scan.nextInt();
    // inisialiasi arrary
    String NamaBarang[] = new String[JumlahBeli];
    int checkkode[] = new int[JumlahBeli];
    int checkqty[] = new int[JumlahBeli];
    double diskon[] = new double[JumlahBeli];
    double harga[] = new double[JumlahBeli];
    double subbayar[] = new double[JumlahBeli];

    // input jumlah Pembelian
    int[] x = new int[JumlahBeli];

    for (int countermenu = 0; countermenu < x.length; countermenu++) {
      int nilai = 1;
      nilai += countermenu;
      System.out.print("Masukkan kode Barang ke-" + nilai + ": ");
      checkkode[countermenu] = scan.nextInt();
      // int [] datacheckkode = new int [checkkode];
      System.out.print("Masukkan qty barang ke-" + nilai + " anda :");
      checkqty[countermenu] = scan.nextInt();
      // int datachecckqty [] = new int [checkqty];
      System.out.println("");

    }

    for (int mulaiproses = 0; mulaiproses < JumlahBeli; mulaiproses++) {
      // mouseblutut 5.0
      if (checkkode[mulaiproses] == 1) {
        NamaBarang[mulaiproses] = "Mouse Bluetooth 5.0  ";
        diskon[mulaiproses] = 0.1;
        harga[mulaiproses] = 149999.00;
        // double totalharga1 = diskon1 * harga * checkqty[mulaiproses];
        // System.out.println("total dari nilai pesanan 1 :" + totalharga1);

      }
      // headphone eksternal
      else if (checkkode[mulaiproses] == 2) {
        NamaBarang[mulaiproses] = "Headphone Eksternal  ";
        diskon[mulaiproses] = 0.05;
        harga[mulaiproses] = 246000.00;
        // double totalharga2 = diskon2 * harga2 * checkqty[mulaiproses];
        // System.out.println("total dari nilai pesanan 2 :" + totalharga2);

      }
      // Powerbank 10.000 mAh
      else if (checkkode[mulaiproses] == 3) {
        NamaBarang[mulaiproses] = "Power Bank 10.000 mAh";
        diskon[mulaiproses] = 0;
        harga[mulaiproses] = 136000.00;
        // double totalharga3 = harga2 * checkqty[mulaiproses];
        // System.out.println("total dari nilai pesanan 3 :" + totalharga3);

      }
      // Tripod Kamera
      else if (checkkode[mulaiproses] == 4) {
        NamaBarang[mulaiproses] = "Tripod Kamera        ";
        diskon[mulaiproses] = 0.2;
        harga[mulaiproses] = 267999.00;
        // Double totalharga4 = diskon * harga2 * checkqty[mulaiproses];
        // System.out.println("total dari nilai pesanan 4 :" + totalharga4);

      }
      // Smart watch Xiomi
      else if (checkkode[mulaiproses] == 5) {
        NamaBarang[mulaiproses] = "Smart Watch Xiomi    ";
        diskon[mulaiproses] = 0.1;
        harga[mulaiproses] = 8999000.00;
        // Double totalharga5 = diskon * harga2 * checkqty[mulaiproses];
        // System.out.println("total dari nilai pesanan 5 :" + totalharga5);

      } else {
        System.out.println("Anda memilih untuk tidak belanja..! hmmm..");
      }
      // Pengaturan format number
      formatRp.setCurrencySymbol("Rp. ");
      formatRp.setMonetaryDecimalSeparator(',');
      formatRp.setGroupingSeparator('.');
      kursIndonesia.setDecimalFormatSymbols(formatRp);

    }
    System.out.println(" ");
    System.out.println("No   Nama Barang                   Harga               QTY  Diskon   Sub Total");

    for (int counter = 0; counter < x.length; counter++) {
      subbayar[counter] = (checkqty[counter] * harga[counter]) - (checkqty[counter] * harga[counter] * diskon[counter]);
      totalbayar += subbayar[counter];
      System.out.print(counter + 1 + ".  " + NamaBarang[counter]);
      System.out.print("          " + kursIndonesia.format(harga[counter])
          + "        " + checkqty[counter] + "    " + diskon[counter] + "     " + subbayar[counter]);
      System.out.println("");



    }
    
    System.out.println("Total Pembayaran Anda : " + kursIndonesia.format(totalbayar));

    // }else{
    // System.out.println("Anda Memilih untuk tidak berbelanja");

    // }

  }

}
