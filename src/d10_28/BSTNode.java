package d10_28;

/**
 * 搜索树数据结构
 * 左子树越来越小、右子树越来越大
 * @author Administrator
 *
 */
public class BSTNode {
	int val;
	BSTNode leftNode;
	BSTNode rightNode;
	
	BSTNode(int val){this.val = val;};
	
	BSTNode(int[] array) {
		this.val = array[0];
		for(int i = 1;i < array.length; i++) {
			this.addNode(array[i]);
		}
	}
	
	public boolean addNode(int key) {
		
		return addNode(this,key);
	}
	
	public boolean addNode(BSTNode node,int key){
		if(key == node.val) {
			return true;
		}else if(key < node.val) {
			if(null == node.leftNode) {
				node.leftNode = new BSTNode(key);
				return true;
			}
			return addNode(node.leftNode,key);
		}else{
			if(null == node.rightNode) {
				node.rightNode = new BSTNode(key);
				return true;
			}
			return addNode(node.rightNode,key);
		}
	}
	
	public boolean deleteNode(int val) {
		
		return false;
	}
	
	public BSTNode searchNode(int val) {
		return searchNode(this,val);
	}
	
	public BSTNode searchNode(BSTNode node, int val) {
		if(null == node) {
			return null;
		}
		if(val == node.val) {
			return node;
		}else if(val < node.val) {
			if(null == node.leftNode) {
				return null;
			}
			return searchNode(node.leftNode, val);
		}else {
			if(null == node.rightNode) {
				return null;
			}
			return searchNode(node.rightNode, val);
		}
	}
	
	public void printNodes() {
		int n = 0;
		printNodes("ROOT", this, n);
	}
	
	public void printNodes(String desc,BSTNode node,int n) {
		n ++;
		System.out.println("深度：" + n + "," + desc + node.val);
		if(null != node.leftNode) {
			printNodes("左：", node.leftNode,n);
		}
		if(null != node.rightNode) {
			printNodes("右",node.rightNode,n);
		}
	}

	@Override
	public String toString() {
		return "BSTNode [val=" + val + "]";
	}
	
}
