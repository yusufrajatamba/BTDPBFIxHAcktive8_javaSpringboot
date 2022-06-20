
abstract class manusia {
    // deklarasi class dan method tipe abstact
    protected abstract void nyanyiLagu();
}

class Cowok extends manusia {
    // menggunakan method dari class manusia sebagai parent class
    @Override
    protected void nyanyiLagu() {
        System.out.println("da di du di dam ");
        // statement dari perilaku yang menampilkan output pesan text yang berbeda dari
        // class manusia
    }
}

class Cewek extends manusia {
    protected void nyanyiLagu() {
        System.out.println("du ri dam dam ");
        // statement dari perilaku yang menampilkan output pesan text yang berbeda dari
        // class manusia
    }}

public class Cetak1 {

    public static void main(String[] args) {
        //buat Object referensi class manusia, dengan cons cowok
        manusia cowok = new Cowok();

        //menampilkan output pada method yang ada di class cowok
        cowok.nyanyiLagu();

         //buat Object referensi class manusia, dengan cons cewek
         manusia cewek = new Cewek();

         //menampilkan output pada method yang ada di class cowok
        cewek.nyanyiLagu();

    }
}
