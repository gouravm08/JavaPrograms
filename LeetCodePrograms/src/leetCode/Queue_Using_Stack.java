package leetCode;

import java.util.Stack;

class MyQueue{
  private Stack<Integer> myStack=new Stack<>();

  void push(int n)
  {
	  this.myStack.push(n);
  }
  
  int pop() {
	  int y=0;
	  Stack<Integer> temp=new Stack<>();
	  while(myStack.size()!=1)
	  {
		  temp.push(myStack.pop());
	  }
	  y=myStack.pop();
	  while(temp.size()!=0) {
		  myStack.push(temp.pop());
	  }
	  return y;
  }
  
  int peek() {
	  int y=0;
	  Stack<Integer> temp=new Stack<>();
	  while(myStack.size()!=1)
	  {
		  temp.push(myStack.pop());
	  }
	  y=myStack.peek();
	  while(temp.size()!=0) {
		  myStack.push(temp.pop());
	  }
	  return y;
  }
  
 boolean isEmpty() {
	 return this.myStack.isEmpty();
 }
 
 void print() {
	 if(myStack.isEmpty())
	 {
		 System.out.println("QUEUE is empty");
		 return;
	 }
	 
	 for(int i=0;i<myStack.size();i++) {
		 System.out.print(myStack.get(i)+" ");
	 }
	 System.out.println();
 
 }
  
}


public class Queue_Using_Stack {

	public static void main(String[] args) {
		MyQueue myQueue=new MyQueue();
		myQueue.push(1);
		myQueue.push(2);
		myQueue.push(3);
		myQueue.print();
		int peek = myQueue.peek();
		System.out.println(peek);
		int pop = myQueue.pop();
		System.out.println(pop);
		myQueue.print();
		int peek1 = myQueue.peek();
		System.out.println(peek1);
		int pop1 = myQueue.pop();
		System.out.println(pop1);
		myQueue.print();
		int peek2 = myQueue.peek();
		System.out.println(peek2);
		int pop2 = myQueue.pop();
		System.out.println(pop2);
		myQueue.print();
		System.out.println(myQueue.isEmpty());
	}

}
