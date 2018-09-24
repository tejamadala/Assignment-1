package Problem2;

public class Q2Utility extends ArbitraryArray
{
	public static void main(String[] args)
	{
		//Code used to test Question 2 methods
		Enqueue('a');
		Enqueue('b');
		Push('c');
		Enqueue('d');
		Push('e');
		Push('f');

		System.out.println(Traverse(53));
		System.out.println(Traverse(2));
		
		System.out.println(Pop());
		System.out.println(Pop());
		System.out.println(Dequeue());
		System.out.println(Pop());
		System.out.println(Dequeue());
		System.out.println(Pop());
		System.out.println(Dequeue());
	}
}