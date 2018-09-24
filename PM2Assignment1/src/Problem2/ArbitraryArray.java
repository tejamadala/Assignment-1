package Problem2;

public class ArbitraryArray
{
	//Initialize empty array
	public static Object[] arb_arr;
	static int size=0;
	
	//Every time a manipulation function is done, the size is altered and a new array is created
	
	static void Push(Object input)
	{
		//Increment size, create a new array of the new size, add input to index zero of new array
		//Copy old array items into the new array starting at index 1
		//account for input being the first item added to this array
		//at the end, set original array arb_arr equal to new array to keep changes when multiple functions are called
		size++;
		Object[] pushed=new Object[size];
		pushed[0]=input;
		
		if(pushed.length!=1)
		{
			for(int i=1; i<size; i++)
			{
				pushed[i]=arb_arr[i-1];
			}
		}
		arb_arr=pushed;
	}
	
	static void Enqueue(Object input)
	{
		//Follow the same procedure as in Push but enqueued element is added to the end of the array
		size++;
		Object[] enqd=new Object[size];
		enqd[size-1]=input; //input will be the last index in array
		if(enqd.length!=1)
		{
			for(int i=0; i<size-1; i++)
			{
				enqd[i]=arb_arr[i];
			}
		}
		arb_arr=enqd;
	}
	
	static Object Pop()
	{
		//create object variable to hold popped data
		//generate new array of size--, copy elements from old array starting at index 1 into new array
		//account for error of popping empty array
		
		try
		{
			Object popped=arb_arr[0];
			size--;
			Object[] pop_arr= new Object[size];
			
			for(int i=0; i<size; i++)
			{
				pop_arr[i]=arb_arr[i+1];
			}
			arb_arr=pop_arr;
			return popped;
		}
		catch(Exception error)
		{
			System.out.println("Error! Pop function cannot be performed on an empty array.");
		}
		return null;
	}
	
	static Object Dequeue()
	{
		//same procedure as pop but performed on the end array element
		try
		{
			Object deqd=arb_arr[size-1];
			size--;
			Object[] deqd_arr=new Object[size];
			for(int i=0; i<size; i++)
			{
				deqd_arr[i]=arb_arr[i];
			}
			arb_arr=deqd_arr;
			return deqd;
		}
		catch(Exception error)
		{
			System.out.println("Error! Dequeue function cannot be performed on an empty array.");
		}
		return null;
	}
	
	static Object Traverse(int in)
	{
		//found will equal the element within arb_arr[in], account for input out of bounds
		try
		{
			Object found;
			found=arb_arr[in];
			return found;
		}
	catch(Exception error)
		{
			System.out.println("Error! The inputted value falls outside the bounds of the array");
		}
		return null;
	}
}