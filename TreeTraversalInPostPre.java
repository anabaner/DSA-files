package BinaryTreesPrograms;
/*
 * Inorder -  left,root,right
 * Preorder -  root,left,right
 * PostOrder - left, right,root
 */
public class TreeTraversalInPostPre {

	public static void main(String[] args) {
		Node root = BinaryTreeUtils.createBinaryTree();
		BinaryTreeUtils.printInOrder(root);
		System.out.println();
		BinaryTreeUtils.printPreOrder(root);
		System.out.println();
		BinaryTreeUtils.printPostOrder(root);
		
	}

}


/*
  1 
/   \
2    3
/ \  / \
4  5 6 7
o/p
 4 2 5 1 6 3 7
 1 2 4 5 3 6 7
 4 5 2 6 7 3 1
*/
