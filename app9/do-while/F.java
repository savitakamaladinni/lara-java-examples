class F 
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
				i++;
				break;
			}
			System.out.println(" body end::"+i);
			i++;
		}
		while (i<=5);
		System.out.println("main begin");
		System.out.println("main end");
	}
}
