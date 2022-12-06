package BinaryTree;

public class BinaryNodeMain {

	public static void main(String[] args) {
		BinaryNodeOperations myBT=new BinaryNodeOperations();
		BinaryNode bt2= new BinaryNode(2,null,null);
		BinaryNode bt7= new BinaryNode(7,null,null);
		BinaryNode bt9= new BinaryNode(9,null,null);
		BinaryNode bt6= new BinaryNode(6,null,null);
		BinaryNode bt5= new BinaryNode(5,null,null);
		BinaryNode bt11= new BinaryNode(11,null,null);
		BinaryNode bt3= new BinaryNode(3,null,null);
		/*
						bt2
					bt7		bt9
				bt3		bt6
					bt5		bt11




		*/
		myBT.root=bt2;
		bt2.left=bt7;
		bt2.right=bt9;
		bt7.left=bt3;
		bt7.right=bt6;
		bt6.left=bt5;
		bt6.right=bt11;
		
		myBT.preorder(myBT.root);
		System.out.println(" Preorder");
		
		myBT.inorder(myBT.root);
		System.out.println(" Inorder");
		
		myBT.postorder(myBT.root);
		System.out.println(" Postorder");
		
		int max=myBT.findMax(myBT.root);
		System.out.println("max is: "+max);

		int sum= BinaryNodeOperations.add(bt2);
		System.out.println("sum is: "+sum);

		System.out.println("leaf count is: "+ getLeafCount(myBT.root));
		
		System.out.println("max height is: "+ maxHeight(myBT.root));

		System.out.println("left leaf count is: "+ leftLeavesSum(myBT.root));
	}
	
	static int getLeafCount(BinaryNode n) {
		   if(n == null) return 0;
		   if(n.left == null && n.right == null) return 1;
		   else return getLeafCount(n.left)
		               + getLeafCount(n.right);
	}

	static boolean isLeaf(BinaryNode node)
	{
		if (node == null)
			return false;
		if (node.left == null && node.right == null)
			return true;
		return false;
	}

	// This function returns sum of all left leaves in a given
	// binary tree
	static int leftLeavesSum(BinaryNode node)
	{
		int res = 0;
		// Update result if root is not NULL
		if (node != null)
		{
			// If left of root is NULL, then add key of
			// left child
			if (isLeaf(node.left))
				res += node.left.data;
			else // Else recur for left child of root
				res += leftLeavesSum(node.left);

			// Recur for right child of root and update res
			res += leftLeavesSum(node.right);
		}

		// return result
		return res;
	}
	
	static int maxHeight(BinaryNode n) {
		  if(n == null) return -1;
		  
		  int lHehight = maxHeight(n.left);
		  int rHeight = maxHeight(n.right);
  
		  return Integer.max(lHehight, rHeight) +1;
	}


}
