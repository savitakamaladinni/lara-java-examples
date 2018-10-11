class i 
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
				break;
			}
				System.out.println("loop body end:"+i);
			i++;
		}
			System.out.println("main end"+i);
	}
}








/* o/p
main begin
loop body begin:2
loop body end:2
loop body begin:3
main end3*/