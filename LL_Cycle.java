public class LL_Cycle {
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        @Override
        public String toString() {
            return "Node(" + data + ")";
        }
    }
    
    boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LL_Cycle list = new LL_Cycle();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
      //  n3.next = n1; // creates a cycle
        // create cycle for test:
        // n3.next = n1;
        System.out.println(list.hasCycle(n1)); // false unless cycle uncommented
    }
}
