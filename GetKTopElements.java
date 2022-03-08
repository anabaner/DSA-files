package HeapSortProblems030122;

public class GetKTopElements {

	public static void main(String[] args) {

		int k = 3;
		int arr[] = {11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
		int size = arr.length;
		HeapSortUtils.getKTopElements(arr,k,size);
		//HeapSortUtils.printArray(arr);
		
		}

}
