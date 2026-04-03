/******************************************************************************

ip :  1 -> 2 -> 3 -> 4 ->5
op : 5 -> 4 -> 3 -> 2 -> 1

*******************************************************************************/
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class Reverse_LL

{
	public static void main(String[] args) {
	  
	  ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        //     while (head!= null) {
        //     System.out.print(head.val + (head.next != null ? " -> " : ""));
        //     head = head.next;
        // }
        ListNode reversedHead = reverseList(head);
        ListNode temp = reversedHead;
        while (temp != null) {
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
	}}
	

    public static ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       ListNode nextval = null;
       while(curr != null){
           nextval = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextval;
    
        }
           return prev;
    }
}
