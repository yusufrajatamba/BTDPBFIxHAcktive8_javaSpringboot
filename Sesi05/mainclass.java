public class mainclass{

abstract class manusia {
    //deklarasi class dan method tipe abstact
    protected abstract void nyanyiLagu();    
}

class Cowok extends manusia{
    //menggunakan method dari class manusia sebagai parent class
    @Override
    protected void nyanyiLagu(){
        System.out.println("da di du di dam ");
        //statement dari perilaku yang menampilkan output pesan text yang berbeda dari class manusia
    }
}

class Cewek extends manusia{
    protected void nyanyiLagu(){
        System.out.println("du ri dam dam ");
        //statement dari perilaku yang menampilkan output pesan text yang berbeda dari class manusia
    }

}}
