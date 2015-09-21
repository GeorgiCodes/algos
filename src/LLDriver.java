package algos;

class LLDriver {

    public static void main(String[] args) {
        testLL();
        System.out.println("Finished All.");

        testLLStack();
    }

    static void testLL() {
        System.out.println("Test LL");

        LL l = new LL();
        l.add(1);
        l.add(2);
        l.length();
        l.find(2);
        l.remove(2);
        l.remove(3);
    }

    static void testLLStack() {
        System.out.println("Test LLStack");
        LLStack lls = new LLStack();
        lls.push(1);
        lls.print();
        lls.push(2);
        lls.print();
        lls.push(3);
        lls.print();
        int val = lls.pop();
        lls.print();
    }
}