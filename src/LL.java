package algos;

public class LL {

    LLNode head;
    int count;

    void add(int data) {
        LLNode n = new LLNode(data);
        if (head == null) {
            head = n;
            count++;
            return;
        }

        LLNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
        count++;
    }

    void remove(int data) {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            count--;
            return;
        }

        LLNode curr = head;
        while (curr != null) {
            if (curr.next != null && curr.next.data == data) {
                curr.next = curr.next.next;
                count--;
                System.out.println("Removed: " + data);
                length();
                return;
            }
        }
    }

    LLNode find(int data){
        if (head == null) {
            return null;
        }
        LLNode curr = head;
        while (curr != null) {
            if (curr.data == data) {
                System.out.println("Found: " + data);
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    int length() {
        System.out.println("Count: " + count);
        return count;
    }
}
