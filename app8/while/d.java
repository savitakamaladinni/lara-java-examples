class d
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		abc:
		while(i<=5)
		{
			System.out.println(" outer loop body begin:"+i);
			for(int j=15;j<=17;j++)
			{
				System.out.println("inner loop body begin:"+i+","+j);
				if(j==16)
				{
					
				break abc;
				}
			System.out.println("inner loop body end:"+i+","+j);
			}
			System.out.println("outer body end:"+i);
			i++;
	}
			System.out.println("main end"+i);
}
}