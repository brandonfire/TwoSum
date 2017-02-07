/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Addtwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode tem;
        ListNode tem1 = l1;
        ListNode tem2 = l2;
        int check = 0;
        head = new ListNode((tem1.val+tem2.val)%10);
        tem = head;
        if((tem1.val+tem2.val)>=10){
            check = 1;
        }
        while(tem1.next != null|| tem2.next !=null)
        {
            if(tem1.next == null)
            {
                tem2 = tem2.next;
                tem.next = new ListNode((tem2.val+check)%10);
                if((tem2.val+check)>=10){
                    check = 1;
                }else check = 0;
                
                tem = tem.next;
            } else if (tem2.next == null)
            {
                tem1 = tem1.next;
                tem.next = new ListNode((tem1.val+check)%10);
                if((tem1.val+check)>=10){
                    check = 1;
                }else check = 0;
                
                tem = tem.next;
            } else
            {
                tem1 = tem1.next;
                tem2 = tem2.next;
                tem.next = new ListNode((tem1.val+tem2.val + check)%10);
                tem = tem.next;
                if((tem1.val+tem2.val + check)>=10){
                    check = 1;
                }else check = 0;
                
            }
           
        }
        if(check == 1)
        {
            tem.next = new ListNode(1);
        }
        return head;
    }
}