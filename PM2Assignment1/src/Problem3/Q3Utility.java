package Problem3;

public class Q3Utility extends Sorters
{
	public static void main(String[] args)
	{
		//need to initialize the sorters class to start stack object
		Sorters stuff= new Sorters();
		stuff.Push(4);
		stuff.Push(8);
		stuff.Push(2);
		stuff.Push(9);
		stuff.Push(5);
		stuff.Push(1);
		stuff.Push(6);
		
		InsertionSort(stuff);
		
		System.out.println(stuff.Pop());
		System.out.println(stuff.Pop());
		System.out.println(stuff.Pop());
		System.out.println(stuff.Pop());
		System.out.println(stuff.Pop());
		System.out.println(stuff.Pop());
		System.out.println(stuff.Pop());
		
		System.out.println(stuff.Pop());
	}
}