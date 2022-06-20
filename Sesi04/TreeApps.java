public class TreeApps extends BuatMainclass{
    
    public static void main(String[] args) {
        
        TreeApps tr=new TreeApps();
        node root= new node();
        int menu=1;
        int r=1;
        int a;
 
        while(menu!=3){
         System.out.println("1.input \n2.View \n3.Selesai \n :");
         menu =tr.in.nextInt();
         if(menu==1){
             System.out.println("masukkan Angka : ");
             a=tr.in.nextInt();
             if(r==1){
                 root.input(a);
                 r--;
             }
             else tr.insert(root,a);
 
         }
         else if(menu==2) tr.view(root);
         else if(menu==3) System.out.println("Selesai. ");
         else System.out.println("Input Salah!");
         System.out.println(" ");
        }
 
     }
     
}
