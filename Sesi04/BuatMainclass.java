import java.util.Scanner;

public class BuatMainclass {

    Scanner in = new Scanner(System.in);

    static void insert(node a, int b) {
        if (b < a.value) {
            if (a.left != null)
                insert(a.left, b);
            else {
                a.left = new node();
                a.left.input(b);
                System.out.println(b + " di kiri " + a.value);
            }
        } else if (b > a.value) {
            if (a.right != null)
                insert(a.right, b);
            else {
                a.right = new node();
                a.right.input(b);
                System.out.println(b + " di kanan " + a.value);
            }
        }
    }

    public void view(node a) {
        System.out.print("PreOrder  : ");
        preOrder(a);
        System.out.println(" ");
        System.out.print("InOrder   : ");
        InOrder(a);
        System.out.println(" ");
        System.out.print("PostOrder : ");
        PostOrder(a);
        System.out.println(" ");
    }

    public void preOrder(node a) {
        if (a != null) {
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

}

class node {

    node left, right;
    int value;

    public void input(int a) {
        value = a;
    }
}