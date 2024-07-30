package leetCode;

public class Tree_Traversal {

	void preOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	void postOrderTraversal(TreeNode root) {
		if (root == null)
			return;

		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.val + " ");
	}

	void inOrderTraversal(TreeNode root) {
		if (root == null)
			return;

		inOrderTraversal(root.left);
		System.out.print(root.val + " ");
		inOrderTraversal(root.right);

	}

	public static void main(String[] args) {
		TreeNode firstRoot = new TreeNode();
		firstRoot.val = 1;
		TreeNode firstNode = new TreeNode();
		firstNode.val = 2;
		firstNode.left = null;
		TreeNode b = new TreeNode();
		b.val = 3;
		b.left = null;
		b.right = null;
		firstNode.right = b;
		firstRoot.left = firstNode;

		Tree_Traversal same_Tree = new Tree_Traversal();
		System.out.println("Pre Order traversal is: ");
		same_Tree.preOrderTraversal(firstRoot);
		System.out.println();
		System.out.println("Post Order traversal is: ");
		same_Tree.postOrderTraversal(firstRoot);
		System.out.println();
		System.out.println("IN Order traversal is: ");
		same_Tree.inOrderTraversal(firstRoot);
	}

}
