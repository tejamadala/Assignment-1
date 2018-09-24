package Problem1;

public class Q1Utility extends ArbitraryQueue
{
		public static void main(String[] args)
	{
		//This was the code used to test the methods for Question 1
		Push("hello");
		Push("world");
		Enqueue(32);
		Push("bye!");
		Enqueue("name");
		
		System.out.println(Traverse(8));
		System.out.println(Traverse(2));
		
		System.out.println(Pop());
		System.out.println(Pop());
		System.out.println(Dequeue());
		System.out.println(Dequeue());
		System.out.println(Dequeue());
		System.out.println(Dequeue());
	}
}