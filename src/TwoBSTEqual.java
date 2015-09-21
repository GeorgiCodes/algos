package algos;

/**
 * Created by georgi on 9/14/15.
 */
public class TwoBSTEqual {

    public static void main(String[] args) {
        BST a = new BST();
        BST b = new BST();

        a.root = new TNode(20);
        a.root.left = new TNode(8);
        a.root.left.left = new TNode(4);
        a.root.left.right = new TNode(12);
        a.root.left.right.left = new TNode(10);
        a.root.left.right.right = new TNode(14);
        a.root.right = new TNode(22);

        b.root = new TNode(20);
        b.root.left = new TNode(8);
        b.root.left.left = new TNode(4);
        b.root.left.right = new TNode(12);
        b.root.left.right.left = new TNode(10);
        b.root.left.right.right = new TNode(14);
//        b.root.right = new TNode(22);

//        boolean res = a.areEqual(a, b);
//        System.out.println("Result: " + res);

        int res = a.findElementCountInRange(10, 12);
        System.out.println("Result: " + res);
    }


}
