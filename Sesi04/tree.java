import java.util.Scanner;

public class tree {
    Scanner in = new Scanner(System.in);
    static void insert(node a, int b) {
       if(b<a.value){
        if(a.left!=null)
        insert(a.left,b);
        else{
            a.left=new node();
            a.left.input(b);
            System.out.println(b + " di kiri " + a.value);
        }
       }
       else if(b>a.value){
        if(a.right!=null)insert(a.right,b);
        else{
            a.right=new node();
            a.right.input(b);
            System.out.println(b+ " di kanan " + a.value );
        }
       }
    }
    public void view(node a){
       // System.out.println("Pre Order : ");
        //preOrder(a);
        System.out.println(" ");
        System.out.println("InOrder : ");
        InOrder(a);
        System.out.println(" ");
        System.out.println("PostOrder : ");
        PostOrder(a);
        System.out.println(" ");
    }
    public void preOrder(node a){
        if(a!=null){
            System.out.print(a.value + " ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }
    
    public void InOrder(node a) {
        if (a != null) {
            InOrder(a.left);
            System.out.print(a.value + " ");
            InOrder(a.right);
        }
    }

    public void PostOrder(node a) {
        if (a != null) {
           PostOrder(a.left);
            PostOrder(a.right);
            System.out.print(a.value + " ");
        }

    }
    public static void main(String[] args) {
        
       tree tr=new tree();
       node root= new node();
       int menu=1;
       int r=1;
       int a;

       while(menu!=3){
        System.out.println("1. input \n 2.View \n 3.Selesai \n :");
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
