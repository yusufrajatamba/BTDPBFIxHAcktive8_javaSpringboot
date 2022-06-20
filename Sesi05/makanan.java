public class makanan extends restoran {
    public static void main(String[] args) {
        // membuat instance/object dari class restoran
        restoran data = new restoran();

        data.setMenu("ayam Goreng");
        data.setharga(17.000);
        data.setspesial(true);

        // memanggil Method Get dari class restoran dan menampilkannya
        System.out.println("Menu Makanan :" + data.getMenu());
        System.out.println("Menu Makanan : Rp." + data.getHarga());
        System.out.println("Menu Makanan " + data.getSpesial());

    }

    // membuat Data Pada variabel

}
