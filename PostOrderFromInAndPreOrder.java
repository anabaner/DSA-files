package BinaryTreesPrograms;

public class PostOrderFromInAndPreOrder {

	public static void main(String[] args) {
		
			int in[] = { 4, 2, 5, 1, 3, 6 };
		    int pre[] = { 1, 2, 4, 5, 3, 6 };
		    int n = in.length;
		    System.out.println("Postorder traversal " );
		    BinaryTreeUtils.printPostFromInPre(in, pre, n);
		}
		
}