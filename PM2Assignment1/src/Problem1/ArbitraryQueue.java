package Problem1;

public class ArbitraryQueue
{
	static class Node
	{
		Object data;	//data in the node
		Node next; //refer to the next node
		Node prev; //refer to the previous node
	}
	
	//Initialize empty queue
	private static Node front=null;
	private static Node behind=null;
	static int size=0;
	
	public static void Push(Object input)
	{
		size++;
		//store past front, generate the new front node, link new front and past front, account for new node to be first entry in queue
		Node past=front;
		front=new Node();
		front.data=input;
		front.next=past;
		front.prev=null;
		
		if(size==1) //accounting for node input to be placed into empty queue
		{
			if(front!=null)
			{
				behind=front;
			}
			else if(behind!=null)
			{
				front=behind;
			}
		}
		else if(size>1) //link normally when dealing with queue that already contains nodes
		{
			past.prev=front;
		}
	}
	
	public static void Enqueue(Object input) 
	{
		//same procedure as Push method but add node to the back of the queue
		size++;
		Node past=behind;
		behind=new Node();
		behind.data=input;
		behind.prev=past;
		behind.next=null;
		
		if(size==1)
		{
			if(front!=null)
			{
				behind=front;
			}
			else if(behind!=null)
			{
				front=behind;
			}
		}
		else if(size>1)
		{
			past.next=behind;
		}
	}
	
	public static Object Pop()
	{
		//utilize try/catch to account for popping a node out of an empty queue
		//account for a queue of size 1 like in push and enqueue methods, create object variable for the popped node
		//set the beginning of the queue to be the node that is next to the popped node, disconnect new front from previous front
		
		try
		{
			if(size==1)
			{
				if(front!=null)
				{
					behind=front;
				}
				else if(behind!=null)
				{
					front=behind;
				}
			}
			
			
			Object popped=front.data;
			front=front.next;
			front.prev=null;
			size--;
			return popped;
		}
		catch(Exception error)
		{
			System.out.println("Error! The pop function cannot be performed on an empty ArbitraryQueue");
		}
		return null;
	}
	
	public static Object Dequeue()
	{
		//same procedure as pop, but performed at the end of the queue
		try
		{
			if(size<1)
			{
				System.out.println("Error! The Dequeue function cannot be performed on an empty ArbitraryQueue");
				return null;
			}
			if(size==1)
			{
				if(front!=null)
				{
					behind=front;
				}
				else if(behind!=null)
				{
					front=behind;
				}
			}
			
			Object deqd=behind.data;
			behind=behind.prev;
			behind.next=null;
			size--;
			return deqd;
		}
		catch(Exception error)
		{
			System.out.println("Error! The Dequeue function cannot be performed on an empty ArbitraryQueue");
		}
		
		return null;
	}
	
	public static Object Traverse(int in)
	{
		//use a pointer and loop to traverse through the queue given the index value
		//try/catch to account for index out of bounds
		//account for front of the queue too in=0
		
		try
		{
			Node ptr=new Node();
			if(in==0)
			{
				return front.data;
			}
			else
			{
				ptr=front;
				for(int i=0; i<in; i++)
				{
					ptr=ptr.next;
				}
				return ptr.data;
			}
		}
		catch(Exception error)
		{
			System.out.println("Index out of bounds! The value inputted exceeds the size of the queue.");
		}
		return null;
	}
}