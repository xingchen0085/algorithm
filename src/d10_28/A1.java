package d10_28;

public class A1 {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		//迭代，线性  O(N)
		//for(ListNode node = node1;node != null;node = node.next) {
		//	System.out.println(node);
		//}
		//递归
		traverse(node3);
	}
	
	static void traverse(ListNode head) {
		System.out.println(head);
		if(null != head.next) {
			traverse(head.next);
		}
	}
}

//链表结构
class ListNode {
	
	int val;
	
	ListNode next;
	
	ListNode(){};
	
	ListNode(int val){this.val = val;};
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return val + "";
	}
}


//二叉树结构
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
}