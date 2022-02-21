package DataStructures;

import java.util.Stack;

public class StackInt {

	public static void main(String[] args) {
		//creating an instance of Stack class  
		Stack<Integer> stk= new Stack<>();  
		// checking stack is empty or not  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stk);  
//		result = stk.empty();  
//		System.out.println("Is the stack empty? " + result);
		//poping elements from stack
		stk.pop();
		System.out.println("The last element is "+stk.peek());
		System.out.println("The position of 113 in the stack is "+stk.search(113));
	}

}
