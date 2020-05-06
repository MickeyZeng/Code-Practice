import ExampleClass.ListNode;

public class reverseKGroup {

    public static void main(String[] args) {
        ListNode bListFive = new ListNode(5);
        ListNode bListFour = new ListNode(4, bListFive);
        ListNode bListThree = new ListNode(3,bListFour);
        ListNode bListTwo = new ListNode(2, bListThree);
        ListNode bListOne = new ListNode(1, bListTwo);
//        removeNthFromEnd.getLength(reverseKGroup(bListOne, 2), 0);
        displayNode(reverseKGroup(bListOne, 3));
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1){
            return head;
        }
        ListNode temp = head;
        ListNode result = new ListNode(0, temp);
        int index = 2;
        ListNode target = temp.next;

        while(temp != null){
            ListNode future = target.next;
            if(index == k){
                temp.next = future;
                break;
            }
            index = index + 1;
            temp = temp.next;
            target = temp.next;
        }

        target.next = result.next;
        System.out.println(target.val);

        return target;
    }

    public static void displayNode(ListNode head){
        int index = 1;
        while (head != null){
            System.out.println(index + " *** " + head.val);
            index = index + 1 ;
            head = head.next;
        }
    }
}
