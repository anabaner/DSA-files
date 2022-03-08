package LinkedListNC;


public class LinkedListOpNC {

	public static void main(String[] args) {
		LinkedListUtilsNC.head = new Node(5);
		LinkedListUtilsNC.head.next = new Node(6);
		LinkedListUtilsNC.head.next.next = new Node(7);
		LinkedListUtilsNC.head.next.next.next = new Node(4);
		LinkedListUtilsNC.head.next.next.next.next = new Node(7);
		
		LinkedListUtilsNC.printList();
		
		LinkedListUtilsNC.deleteNode(6);
		LinkedListUtilsNC.printList();
		
		LinkedListUtilsNC.insertAtHead(6); //inserts at head 
		LinkedListUtilsNC.insertAtHead(2);
		LinkedListUtilsNC.printList();
		
		LinkedListUtilsNC.insertsAfter(LinkedListUtilsNC.head.next,6);
		LinkedListUtilsNC.printList();
		
		LinkedListUtilsNC.insertsAtEnd(9);
		LinkedListUtilsNC.printList();
		
		LinkedListUtilsNC.deleteNodeatPos(2);
		
		int count = LinkedListUtilsNC.countNodes();
		System.out.println(count);
		
		LinkedListUtilsNC.sortList();
		LinkedListUtilsNC.printList();
		
		LinkedListUtilsNC.removeduplicates();
		LinkedListUtilsNC.printList();
		
		LinkedListUtilsNC.reverseLinkedList();
		LinkedListUtilsNC.printList();
	}

}
