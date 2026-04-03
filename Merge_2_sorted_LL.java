

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    
    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Merge_2_sorted_LL {
    public static void main(String[] args) {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        head1.next = new SinglyLinkedListNode(3);
        head1.next.next = new SinglyLinkedListNode(5);
        
        SinglyLinkedListNode head2 = new SinglyLinkedListNode(2);
        head2.next = new SinglyLinkedListNode(4);
        head2.next.next = new SinglyLinkedListNode(6);
        
        SinglyLinkedListNode mergedHead = mergeLists(head1, head2);
        
        // Print the merged linked list
        SinglyLinkedListNode temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
    } static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedListNode temp =  new SinglyLinkedListNode(-1);
        SinglyLinkedListNode curr = temp;
        
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
               curr.next = head1;
            head1 = head1.next;
         }
         else{
            curr.next = head2;
            head2 = head2.next;
         }
         curr = curr.next;
        }
        if(head1!=null){
             curr.next = head1;
        }
        else{
            curr.next  = head2;
        }
        return temp.next;
        }
}
