class BSTDemo
{
	class node{
		int data;
		node left,right;
	node(int data)
	  { 
		this.data=data;
		left=right=null;
	  }
	}
	node root=null;
	
	public node insertRec(node root,int data)
	{
		if(root==null)
		{
			root=new node(data);
			return root;
		}
		if(root.data>data)
		  root.left=insertRec(root.left,data);
		else if(root.data<data)
			root.right=insertRec(root.right,data);
		return root;
	}
	
	public void inorder(node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
            inorder(root.right);
		}

	}
	
	public void postOrder(node root)
	{
		if(root!=null){
		 postOrder(root.left);
		 postOrder(root.right);
		System.out.print(root.data+" ");

		}
	}
     public void preorder(node root)
     {
     	if(root!=null)
     	{
     		System.out.print(root.data+" ");
     		preorder(root.left);
     		preorder(root.right);
     	}

     }
	public static void main(String[] args) {
		BSTDemo tree=new BSTDemo();
         System.out.println("inorder--");
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);
		tree.insert(40);
		tree.insert(20);
		tree.insert(10);
		tree.insert(65);
		tree.insert(35);
		tree.insert(55);
		tree.insert(90);
         tree. inorder(tree.root);
         System.out.println();
         System.out.println("postOrder--");
         tree.postOrder(tree.root);
         System.out.println();
         System.out.println("preorder--");
          tree.preorder(tree.root);
	}
}