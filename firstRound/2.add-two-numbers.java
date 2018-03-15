/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode p1=l1;
	ListNode p2=l2;
	ListNode prev=null;
	ListNode resultHead=null;
	int flag=0;
	while(p1!=null||p2!=null||flag==1){
		int i=0;
		int j=0;
		if(p1!=null){
			i=p1.val;
		}
		if(p2!=null){
			j=p2.val;
		}
		int result=0;
		result=i+j+flag;
		if(result>=10){
			result=result%10;
			flag=1;
		}else{
			flag=0;
		}
		ListNode newNode = new ListNode(result);
		if(resultHead==null){
			resultHead=newNode;
		}
		if(prev!=null){
			prev.next=newNode;
			prev=prev.next;
		}else{
			prev=resultHead;
		}
		
		if(p1!=null) p1=p1.next;
		if(p2!=null) p2=p2.next;
    	}
	return resultHead;
    }
}
