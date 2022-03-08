package HeapSortProblems030122;

public class KSortedArray {
	public static void main(String[] args) {

	int key = 3;
	int arr[] = {6, 5, 3, 2, 8, 10, 9};
	HeapSortUtils.doKSorting(arr,key);
	HeapSortUtils.printArray(arr);
	
	}
}
