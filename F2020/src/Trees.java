import java.util.ArrayList;

public class Trees {

    public static void main(String[] args) {
        System.out.println("hello world");
        int n1 = 3;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(6);
        al.add(n1);
        System.out.println(al);
        System.out.println(al.get(0).intValue());

        Node n = new Node(4);
        n.left = new Node(2);
        n.left.left = new Node(1);
        n.left.right = new Node(3);
        n.right = new Node(6);
        n.right.left = new Node(5);
        n.right.right = new Node(7);

//        iot_verbose(n);
//        prot_verbose(n);
        poot_verbose(n);
    }
    public static void iot_verbose(Node n){
        if (n == null) {
            System.out.println("hit null");
            return;
        }
        System.out.println("going left");
        iot_verbose(n.left);
        System.out.println("visiting " + n.val);
        System.out.println("going right");
        iot_verbose(n.right);
    }

    public static void prot_verbose(Node n){
        if (n == null) {
            System.out.println("hit null");
            return;
        }
        System.out.println("visiting");

        System.out.println("going left");
        prot_verbose(n.left);

        System.out.println("going right");
        prot_verbose(n.right);
    }

    public static void poot_verbose(Node n){
        if (n == null) {
            System.out.println("hit null");
            return;
        }
        System.out.println("going left");
        poot_verbose(n.left);

        System.out.println("going right");
        poot_verbose(n.right);

        System.out.println("visiting");
    }

}

class Node{
    public int val;
    public Node left;
    public Node right;
    Node(int val){
        this.val = val;
    }
}