class h 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=2;
		while(i<=5)
		{
			System.out.println("loop body begin:"+i);
			if(i==3)
			{
				continue;
			}
				System.out.println("loop body end:"+i);
			i++;
		}
			System.out.println("main end"+i);
	}
}

/* o/p... infinite loop*/