import ExampleClass.ListNode;

public class mergeTwoLists {

    public static void main(String[] args) {
        //l1
        ListNode aListThree = new ListNode(4);
        ListNode aListTwo = new ListNode(2, aListThree);
        ListNode aListOne = new ListNode(1, aListTwo);
        //l2
        ListNode bListThree = new ListNode(4);
        ListNode bListTwo = new ListNode(3, bListThree);
        ListNode bListOne = new ListNode(1, bListTwo);

        removeNthFromEnd.getLength(mergeTwoLists(aListOne,bListOne), 0);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode tempNode = resultNode;

        while(l1 != null && l2 != null){
            if(l1.val <  l2.val){
                tempNode.next = l1;
                l1 = l1.next;
            }else{
                tempNode.next = l2;
                l2 = l2.next;
            }
            tempNode = tempNode.next;
        }

        if(l1 == null){
            tempNode.next = l2;
        }else{
            tempNode.next = l1;
        }

        return resultNode.next;

    }
}
