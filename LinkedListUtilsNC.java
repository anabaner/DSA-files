package LinkedListNC;


public class LinkedListUtilsNC {
	public static Node head;

	public static void printList() {
		Node n= head;
		while(n!=null) {
			System.out.print(" "+n.data);
			n=n.next;
		}
		System.out.println();
	}

	public static void deleteNode(int keyTobedeleted) {
		
		Node temp = head; Node prev = null;
		while(temp!=null && temp.data==keyTobedeleted) { //deleting head node
			head = temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=keyTobedeleted) { //else traverse linkedlist
			prev = temp;
			temp = temp.next;
		}
		if(temp==null)
			return ;
		
		prev.next = temp.next;
		
	}

	public static void insertAtHead(int i) {
		
		Node new_node = new Node(i);
		new_node.next = head; //shifting the head 
		head = new_node; //putting the new_node at head pos
		
	}

	public static void insertsAfter(Node prev, int keyTobeInserted) {
		if(prev == null) {
			System.out.println("previous cant be null");
		}
		Node new_node = new Node(keyTobeInserted);
		new_node.next = prev.next; //Make next of new Node as next of prev_node
		prev.next = new_node; //make next of prev_node as new_node
		
	}
	
	public static void deleteNodeatPos(int pos) {
		
	}

	public static void insertsAtEnd(int keyAtEnd) {
		Node new_node = new Node(keyAtEnd);
		if(head == null ) {
			head = new_node;
			return;
		}
		new_node.next = null;
		Node last = head ;
		
		while(last.next!=null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}

	public static int countNodes() {
		Node temp = head ;
		int count = 0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count ;
	}

	public static void removeduplicates() {
		Node curr = head;
		while(curr!=null) {
			Node temp = curr;
			while(temp!=null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
		
	}

	public static void sortList() {
		Node curr = head , index = null;
		int temp ;
		
		if(head == null)
			return;
		
		while(curr!=null) {
			index = curr.next;
			
			while(index!=null) {
				if(curr.data>index.data) {
					temp = curr.data;
					curr.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			curr = curr.next ;
		}
	}

	public static void reverseLinkedList() {
		Node curr = head ;
		Node next,prev = null;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr ;
			curr = next;
		}
		head=prev;
		
	}
}

  class Node{
	int data;
	Node next ;
	public Node(int data) {
		this.data = data;
		next = null;
	}
}
