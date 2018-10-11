class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		do
		{
			System.out.println(" body begins:"+i);
			if(i==3)
			{
				continue;
			}
			System.out.println(" body ebd::"+i);
			i++;
		}
		while (i<=5);
		System.out.println("main begin");
		System.out.println("main end");
	}
}

//o/p
//infinite loop