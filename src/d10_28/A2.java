package d10_28;

public class A2 {
	public static void main(String[] args) {
//		BSTNode root = new BSTNode(9);
//		root.addNode(11);
//		root.addNode(10);
//		root.addNode(8);
//		root.addNode(9);
//		root.addNode(12);
//		root.addNode(15);
		//61, 87, 59, 47, 35, 73, 51, 98, 37, 93
		BSTNode root = new BSTNode(new int[] {61, 87, 59, 47, 35, 73, 51, 98, 37, 93});
		
		root.printNodes();
		
		BSTNode searchNode = root.searchNode(93);
		System.out.println(searchNode);
	}
}
