
class Node
{
	String data;
	Node kiri,kanan;
	public Node(String d)
	{
		data=d;
		kiri=kanan=null;
	}
}
public class NodeRun {
	Node root;
	NodeRun()
	{
		root=null;
	}
	void preorder(Node node)
	{
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preorder(node.kiri);
		preorder(node.kanan);
	}
	void inorder(Node node)
	{
		if (node == null) {
			return;
		}
		inorder(node.kiri);
		System.out.println(node.data);
		inorder(node.kanan);
	}
	void postorder(Node node)
	{
		if (node == null) {
			return;
		}
		postorder(node.kiri);
		postorder(node.kanan);
		System.out.println(node.data);
	}
    public static void main(String[] args) {
    	NodeRun tree = new NodeRun();
    	tree.root = new Node("X");
    	tree.root.kiri = new Node("B");
    	tree.root.kiri.kiri = new Node("C");
    	tree.root.kiri.kanan = new Node("I");
    	tree.root.kiri.kanan.kiri = new Node("O");
    	tree.root.kiri.kanan.kanan = new Node("V");
    	tree.root.kanan = new Node("R");
    	tree.root.kanan.kiri = new Node("K");
    	tree.root.kanan.kanan = new Node("A");
    	System.out.println("Preorder");
    	tree.preorder(tree.root);
    	System.out.println("===================================");
    	System.out.println("Inorder");
    	tree.inorder(tree.root);
    	System.out.println("===================================");
    	System.out.println("Postorder");
    	tree.postorder(tree.root);
    	System.out.println("===================================");
    }
}
