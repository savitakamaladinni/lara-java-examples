class b
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		while(i<=5)
		{
			System.out.println(" outer loop body begin:"+i);
			//int j=15;
			//while(j<=17)
			for(int j=15;j<=17;j++)
			{
				System.out.println("inner loop body begin:"+i+","+j);
				System.out.println("inner loop body end:"+i+","+j);
			//j++;
			}
			System.out.println("outer body end"+i);
			i++;
	}
			System.out.println("main end"+i);
}

}