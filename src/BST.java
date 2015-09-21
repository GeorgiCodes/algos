package algos;

import java.util.ArrayList;

// Insert, Deletion, Search are all O(log(n))
// Nodes printed is O(n)
// Find next highest node O(log(n))
public class BST {

    TNode root;

    // Time: O(log(n))
//    void insert(int data) {
//        TNode n = new TNode(data);
//        if (root == null) {
//            root = n;
//            return;
//        }
//
//        TNode curr = root;
//        while (curr != null) {
//            if (data > curr)
//        }
//    }

    // Time: O(log(n))
    TNode search(int data) {
        if (root == null) {
            return null;
        }

        TNode curr = root;
        while (curr != null) {
            if (data == curr.data) {
                return curr;
            }
            if (data < curr.data) {
                curr = curr.left;
            }
            if (data > curr.data)  {
                curr = curr.right;
            }
        }
        return null;
    }

    TNode searchRecursive(TNode root, int data) {
        if (root == null) return null;
        if (data > root.data) {
            return searchRecursive(root.right, data);
        } else {
            return searchRecursive(root.left, data);
        }
    }

    // Time: O(n)
    int height(TNode n) {
        if (n == null) return 0;
        return 1 + Math.max(height(n.left), height(n.right));
    }

    // Time: O(n)
    void preorder(TNode n) {
        if (n == null) return;
        System.out.println(n.data);
        preorder(n.left);
        preorder(n.right);
    }

    // Time: O(n)
    void postorder(TNode n) {
        if (n == null) return;
        preorder(n.left);
        preorder(n.right);
        System.out.println(n.data);
    }

    // Time: O(n)
    void inorder(TNode n) {
        if (n == null) return;
        preorder(n.left);
        System.out.println(n.data);
        preorder(n.right);
    }

    boolean areEqual(BST a, BST b) {
        return same(a.root, b.root);
    }

    boolean same(TNode a, TNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        System.out.println("a: " + a.data + " b: " + b.data);
        if (a.data != b.data) return false;

        boolean left = same(a.left, b.left);
        boolean right = same(a.right, b.right);
        return left && right;
    }

    int findCommonAncestorA(int a, int b) {
        if (root == null) throw new UnsupportedOperationException();

        TNode curr = root;
        ArrayList<Integer> aList = new ArrayList<Integer>();
        while (curr != null) {
            aList.add(curr.data);
            if (a == curr.data) {
                break;
            }
            if (a < curr.data) {
                curr = curr.left;
            }
            if (a > curr.data)  {
                curr = curr.right;
            }
        }

        ArrayList<Integer> bList = new ArrayList<Integer>();
        while (curr != null) {
            bList.add(curr.data);
            if (a == curr.data) {
                break;
            }
            if (a < curr.data) {
                curr = curr.left;
            }
            if (a > curr.data)  {
                curr = curr.right;
            }
        }

        // now loop through each lest and find the differing point - easy!


        throw new UnsupportedOperationException();
    }

    // Time: O(log(n))
    int findCommonAncestorB(int a, int b) {
        if (root == null) throw new UnsupportedOperationException();

        // if a and b are less than root, go left
        TNode curr = root;
        while (curr != null) {
            if (a < curr.data && b < curr.data) {
                curr = curr.left;
            } else if (a > curr.data && b > curr.data) {
                curr = curr.right;
            } else {
                return curr.data;
            }
        }

        throw new UnsupportedOperationException();
    }

    int findElementCountInRange(int start, int end) {
        return countLessThan(root, start);
    }

    int countLessThan(TNode n, int start) {
        if (root == null) throw new UnsupportedOperationException();
        if (n == null) return 0;
        System.out.println("data: " + n.data + " start " + start);
        if (n.data > start) return 0;
        // if n.data < start, inc++, else curr = n.left

        return 1 + countLessThan(n.left, start) + countLessThan(n.right, start);
    }
}
