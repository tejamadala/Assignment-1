package Problem3;

public class Sorters
{
	//Node class needs to be set up in order to initialize the list
	private Node first;
	
	class Node
	{
		public Node next;
		public int data;
	}
	
	public Sorters()
	{
		first=null;
	}
	
	public static void InsertionSort(Sorters list)
	{
		//initialize a secondary stack for sorting
		Sorters l2=new Sorters();
		//account for empty stack
		//while loops will be used with if conditionals to perform the comparison and switches
		if(list.first==null)
		{
			System.out.println("Error! InsertionSort cannot be performed on an empty stack.");
		}
		else
		{
			while(list.first!=null)
			{
				int x=list.Pop();
				if(l2.first!=null)
				{
					int see=l2.Peek();
					if(x>see)
					{
						while(l2.first!=null)
						{
							int n=l2.Pop();
							list.Push(n);
							System.out.println("Swapped "+x+" with "+see+".");
						}
					}
				}
				l2.Push(x);
			}
			while(l2.first!=null)
			{
				int a=l2.Pop();
				list.Push(a);
			}
		}
	}
	
	public void Push(int input)
	{
		//basic push implementation
		 Node past=first;
		 first=new Node();
		 first.data=input;
		 first.next=past;
	}
	
	public int Pop()
	{
		//basic pop implementation, use try catch to account for empty stack
		try
		{
			Node past=first;
			first=first.next;
			int popint=past.data;
			return popint;
		}
		catch(Exception error)
		{
			System.out.println("Error! Pop function cannot be performed on an empty list! This is indicated with a -1.");
		}
		return -1;
	}
	
	public int Peek()
	{
		//return the data of the first node, without manipulating stack, account for empty stack w/ try/catch
		try
		{
			int num=first.data;
			return num;
		}
		catch(Exception error)
		{
			System.out.println("Error! Cannot Peek into an empty list! This is indicated with a -1 output.");
		}
		return -1; 
	}
	
	public int pastPeek()
	{
		return Peek();
	}
}