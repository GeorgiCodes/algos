package algos;

public class LLStack {

    LLNode head;

    // Time: O(n)
    void push(int data) {
        LLNode n = new LLNode(data);
        if (head == null) {
            head = n;
            return;
        }

        LLNode currHead = head;
        head = n;
        head.next = currHead;
    }

    // Time: O(1)
    int pop() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        System.out.println("Popping " + val);
        head = head.next;
        return val;
    }

    void print() {
        LLNode curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
