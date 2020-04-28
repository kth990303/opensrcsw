package StackPeople;

class MyStack {
	private int size;
	private int top;
	private int[] stack;
	
	public int[] getStack() {
		return stack;
	}
	public MyStack(int size) {
		this.size=size;
		top=-1;
		try {
			stack=new int[size];
		} catch(OutOfMemoryError e) {
			size=0;
		}
	}
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(top>=size-1)
			return true;
		else
			return false;
	}
	public void doPush(int num) {
		if (isFull())
			System.out.println("Stack is full!");
		else {
			stack[++top]=num;
		}
	}
	public int doPop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return -1;
		}	
		else {
			int num=stack[top--];
			return num;
		}
	}
	public int doPeek() {
		if(isEmpty()){
			System.out.println("Stack is empty!");
			return -1;
		}
		else
			return stack[top];
	}
}
