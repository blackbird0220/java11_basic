package sec2;

public class CharStack {
	private StringBuffer stack;
	public CharStack() {
		stack = new StringBuffer();
	}
	
	public CharStack() {
		stack = new StringBuffer(capacity);
	}
	public void push(char c) {
		stack = stack.append(c);
		
	}
	public int pop() {
		char ch = stack.charAt(stack.length()-1);
		stack = stack.deleteCharAt(stack.length()-1);
		return 1;
	}
	public char[] list() {
		char[] arr = stack.substring(0).toCharArray();
		return arr;
	}
	public String toString() {
		return this.stack
	}
}
