import ExampleClass.ListNode;


public class swapPairs {
    public static void main(String[] args) {
        ListNode bListFour = new ListNode(4);
        ListNode bListThree = new ListNode(3,bListFour);
        ListNode bListTwo = new ListNode(2, bListThree);
        ListNode bListOne = new ListNode(1, bListTwo);
        removeNthFromEnd.getLength(swapPairs(bListOne), 0);
    }

    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        ListNode current = head.next;
        ListNode result = current;

        while (true){
            ListNode future = current.next;
            current.next = temp;
            temp.next = future;

            if(future == null || future.next == null){
                break;
            }

            temp.next = future.next;
            temp = future;
            current = temp.next;


        }

        return result;
    }

}
