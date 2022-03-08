package BinaryTreeProblems;

import java.util.Arrays;

public class BinaryTreeOperations {

	public static void main(String[] args) {
		BinaryTreeUtils.root = new Node(2);
		BinaryTreeUtils.root.right = new Node(4);
		BinaryTreeUtils.root.left = new Node(7);
		BinaryTreeUtils.root.left.left = new Node(5);
		BinaryTreeUtils.root.left.right = new Node(6);
		BinaryTreeUtils.root.right.left = new Node(1);
		BinaryTreeUtils.root.right.right = new Node(10);
		
		BinaryTreeUtils.doInorderTraversal(BinaryTreeUtils.root );
		BinaryTreeUtils.doLevelOrderTraversal(BinaryTreeUtils.root );
		int arr[] = BinaryTreeUtils.convertToArray();
		System.out.println(Arrays.toString(arr));
		
	}

}
