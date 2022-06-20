public class restoran {

     private String menu;
     private double harga;
     private boolean spesial;

     // method Setter Piublic dengan params

     public void setMenu(String menu) {
          this.menu = menu;
     }

     public void setharga(double harga) {
          this.harga = harga;
     }

     public void setspesial(boolean spesial) {
          this.spesial = spesial;
     }

     // method Getter (public)
     public String getMenu() {
          return menu;
     }

     public double getHarga() {
          return harga;
     }

     public boolean getSpesial() {
          return spesial;
     }
}
