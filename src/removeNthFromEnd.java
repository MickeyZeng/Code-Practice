import ExampleClass.ListNode;

public class removeNthFromEnd {
    public static void main(String[] args) {

//        ListNode FiveNode = new ListNode(5);
//        ListNode FourNode = new ListNode(4,FiveNode);
//        ListNode ThreeNode = new ListNode(3, FourNode);
        ListNode TwoNode = new ListNode(2);
        ListNode OneNode = new ListNode(1 , TwoNode);
//        removeNthFromEnd(OneNode,2);
//        removeNthFromEnd(OneNode, 2);
        getLength(removeNthFromEnd(OneNode, 2) , 0);
    }

    public static ListNode temp;

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        temp = new ListNode();
        if(head.next == null){
            return null;
        }
        int i = getLength(head, 0, n);

        if(i == n){
            return temp;
        }

        return head;
    }

    public static int getLength(ListNode tempNode, int i, int n){
        if(tempNode.next != null) {
            i = getLength(tempNode.next, i, n) + 1;
            if(i == n + 1){
                if(n != 1) {
                    tempNode.next = temp;
                }else{
                    tempNode.next = null;
                }
            }

            if(i == n){
//                System.out.println("This is " + i + "的元素" + tempNode.val + "下一个元素" + tempNode.next.val);
                if(tempNode.next != null) {
                    temp = tempNode.next;
                }
            }
        }else{
            i = i + 1;
        }
        return i;
    }

    public static int getLength(ListNode tempNode, int i){
        if(tempNode.next != null){
            i = getLength(tempNode.next , i) + 1;
            System.out.println(i + " &&&& " + tempNode.val);
        }else{
            i = i + 1;
            System.out.println(i + " &&&& " + tempNode.val);
        }
        return i;
    }
}
