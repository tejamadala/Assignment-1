package Problem4;

public class ProblemSolving
{
	//Problem 4A will be done using a stack
	//Through a for loop, each character from input string will be pushed onto the stack
	//Through a second for loop, each character from the stack will be popped and added to the output string
	//This will put the string in reverse order
	//A Node class, Push and Pop methods will be used to complete this problem
	
	static class Node
	{
		Node next;
		char data;
	}
	
	private static Node first=null;
	static int size=0;
	
	private static void Push(char letter)
	{
		//given character will be pushed onto stack
		Node past=first;
		first=new Node();
		first.data=letter;
		first.next=past;
	}
	
	private static char Pop()
	{
		//character will be popped out of the stack, which will be used to add onto reversed string
		Node past=first;
		first=first.next;
		return past.data;
	}
	
	public static String Problem4A(String input)
	{
		//given input string, initialize reversed string
		//use for loop and charAt to get individual character and push onto stack
		//use second for loop to pop each character and add to reversed string
		String reverse="";
		int input_size=input.length();
		
		for(int i=0; i<input_size; i++)
		{
			Push(input.charAt(i));
		}
		
		char popped;
		
		for(int i=0; i<input_size; i++)
		{
			popped=Pop();
			reverse=reverse+popped;
		}
		
		return reverse;
	}
	
	public static int Problem4B(int[][] table, int sum)
	{
		return 0;
	}
	
	public static int Problem4C(int in)
	{
		return 1;
	}
}