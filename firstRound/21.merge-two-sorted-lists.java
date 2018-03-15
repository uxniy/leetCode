/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	if(l1==null){
		return l2;
	}else if(l2==null){
		return l1;
	}
	ListNode head=new ListNode(0);
	ListNode l3=head;
	while(l1!=null && l2!=null){
		if(l1.val<l2.val){
			l3.next=l1;
			l1=l1.next;
		}else{
			l3.next=l2;
			l2=l2.next;
		}
		l3=l3.next;
	}
	if(l1!=null){
		l3.next=l1;
	}else if(l2!=null){
		l3.next=l2;
	}
	return head.next;        
    }
}
