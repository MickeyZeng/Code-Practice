import ExampleClass.ListNode;

public class mergeKLists {
    public static void main(String[] args) {
        //l1
        ListNode aListThree = new ListNode(5);
        ListNode aListTwo = new ListNode(4, aListThree);
        ListNode aListOne = new ListNode(1, aListTwo);
        //l2
        ListNode bListThree = new ListNode(4);
        ListNode bListTwo = new ListNode(3, bListThree);
        ListNode bListOne = new ListNode(1, bListTwo);
        //l3
        ListNode cListTwo = new ListNode(6);
        ListNode cListOne = new ListNode(2, cListTwo);

        ListNode[] listNodes = {};


        removeNthFromEnd.getLength(mergeKLists(listNodes), 0);
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0){
            return null;
        }

        ListNode resultNode = new ListNode(0);
        ListNode tempNode = resultNode;
        int temp = 100000; //存最小的值
        boolean flag = true;
        int position = -1;

        while(flag){
            flag = false;
            for (int i = 0; i < lists.length; i++) {
                if(lists[i] == null){
                    continue;
                }
                if(lists[i].val < temp ){
                    temp = lists[i].val;
                    position = i;
                    tempNode.next = lists[i];
                }
            }
            temp = 1000;
            if(position >= 0){
                lists[position] = lists[position].next;
            }

            for (int i = 0; i < lists.length; i++) {
                if(lists[i] != null){
                    flag = true;
                }
            }

            tempNode = tempNode.next;



        }

        return resultNode.next;

    }
}
