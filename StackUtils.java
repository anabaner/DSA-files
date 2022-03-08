package StackAndQueue;

public class StackUtils {
static int MAX = 1000;
static int A[] = new int[MAX];
static int top;

StackUtils() {
	top=-1;
}


public static boolean isOverflow() {
	return top>=MAX-1;
}
public static boolean isUnderflow(){
	return top<0;
}
	public static void push(int key) {
		if(isOverflow())
			return;
		
		A[++top] = key;
		System.out.println("pushed into stack ::"+key);
	}

	public static int pop() {
		if(isUnderflow())
			return 0;
		return A[top--];
	}

	public static int peek() {
		if(isUnderflow())
			return 0;
		return A[top];
	}

	public static void printStack() {
		for(int i= top;i>-1;i--) {
			System.out.println(A[i]+" ");
		}
	}

}
