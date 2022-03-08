package HeapSortProblems030122;

import java.util.Iterator;
import java.util.PriorityQueue;

public class HeapSortUtils {

	public static void sort(int[] arr) {
		int n = arr.length;
		
		for(int j = n/2-1;j>=0;j--) {
			heapify(arr,n,j); //Build Heap
			
		}
		
		for(int i = n-1;i>0;i--) {
			int temp = arr[0];
			arr[0]= arr[i];
			arr[i] = temp;
			
			heapify(arr,i,0);
		}
	}

	private static void heapify(int[] arr, int n, int i) { 
		
    int largest = i; 
    int l = 2 * i + 1; 
    int r = 2 * i + 2; 

    if (l < n && arr[l] > arr[largest])
        largest = l;

    if (r < n && arr[r] > arr[largest])
        largest = r;

    if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;

        heapify(arr, n, largest);
    }
    
	}

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void doKSorting(int[] arr, int key) {
		int index = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i=0;i<key+1;i++) {
			q.add(arr[i]);
		}
		for(int j = key+1;j<arr.length;j++) {
			arr[index++] = q.peek();
			q.poll();
			q.add(arr[j]);
		}
		
		Iterator<Integer> itr = q.iterator();
		while(itr.hasNext()) {
			arr[index++] = q.peek();
			q.poll();
		}
		
	}

	public static void getKTopElements(int[] arr, int k, int size) {
		PriorityQueue<Integer> minHeap= new PriorityQueue<Integer>();
		
		for(int i=0;i<k;i++) {
			minHeap.add(arr[i]);
		}
		
		for(int i = k;i<size;i++) {
			if(minHeap.peek() > arr[i])
				continue;
			
			else {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		Iterator<Integer> itr = minHeap.iterator();
		while(itr.hasNext())
		System.out.print(" "+itr.next());
	}

}
