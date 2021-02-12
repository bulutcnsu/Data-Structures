class Node{
	int key;
	Node left,right;
	
	public Node(int item) {
		key = item;
		left = right =null;
		
	}
}

public class BinaryTree {

	Node root;
	
	public BinaryTree(int key) {
		root =new Node(key);
		
	}
	BinaryTree(){
		root = null;
	}
	public static void main(String[] args) {
		
		BinaryTree tree= new BinaryTree();
		tree.root = new Node(1); //creating root
		tree.root.left = new Node(3);
		tree.root.right = new Node(4);
		tree.root.left.left= new Node(7);

	}

}
