class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		do
		{
			System.out.println(" outer loop begin:"+i);
			int j=10;
			while(j<=12)
			{
			System.out.println("inner loop begin:"+i+","+j);
			if(j==11)
				{
				continue;
			}
			
		System.out.println("inner loop end:"+i+","+j);
		j++;
		}
		i++;
	}
	while(i<=5);
		System.out.println("main begin");
		System.out.println("main end");
	}
}
//o/p
//infinite loop