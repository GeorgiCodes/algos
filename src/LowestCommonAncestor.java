package algos;

/**
 * Created by georgi on 9/14/15.
 */
public class LowestCommonAncestor {

//    Given the value of two nodes in a binary search tree, find the lowest (nearest) common ancestor. You may assume that both values already exist in the tree.
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new TNode(20);
        tree.root.left = new TNode(8);
        tree.root.left.left = new TNode(4);
        tree.root.left.right = new TNode(12);
        tree.root.left.right.left = new TNode(10);
        tree.root.left.right.right = new TNode(14);
        tree.root.right = new TNode(22);

        int res = tree.findCommonAncestorB(4, 14); // answer 8
        System.out.println("Result: " + res);
    }
}
