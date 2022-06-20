
import java.util.LinkedList;

public class Linkedllist {

    public static void main(String[] args) {
        //membuat instance/object dari Linkedlist

        LinkedList<String> buah = new LinkedList<>();

        //menambahkan data pada object buah

        buah.addFirst("Jeruk");
        buah.add("semangka ");
        buah.add("Pisang");
        buah.add("Mangga");
        buah.add("Rambutan");
        buah.add("Belimbing");
        buah.add("Nangka");

        //dibawah ini mencetak data
        System.out.println("Buah :" +buah);
        
        //Menghitung panjang array/ukuran object
        System.out.println("Jumlah buah : " + buah.size());

        //dibawah ini function untuk menambahkan data pada array/object buah

        buah.addFirst("Buah Pertama");
        buah.addLast("Buah Terakhir");

        buah.add(2, "Buah urutan 3");
        buah.add(7, "buah urutan 8");

        System.out.println("Data Buah Terbaru :" + buah );
        System.out.println("Ini Jumlah buah terbaru: " + buah.size());

        //dibawah ini menampilkan array/object array sesuai index

        System.out.println("Ini Data Buah Pertama :" + buah.getFirst());
        System.out.println("Ini Data Buah terakhir :"+ buah.getLast());
        System.out.println("Ini Data Buah ke 5 :"+ buah.get(4));
        System.out.println("ini Data Buah ke 3 :"+ buah.get(2));

        //dibawah ini menghapus data array buah

        buah.remove(4);
        buah.remove(2);

        System.out.println("Buah ke 5 dan ke 3 sudah dihapus");
        System.out.println("Data buah terbaru:"+buah);


        //dibawah ini melakukan cek data kosong atau berisi (keseluruhan)

        if(buah.isEmpty()){
            System.out.println("Data Kosong");

        }
        else
        System.out.println("Data Berisi Penuh");

        //dibawah ini melakukan cek data sesuai index array
        if(buah.contains("Pisang")){
            System.out.println("Data ditemukan");

        }else
        System.out.println("Data tidak Ditemukan");
    }
}
