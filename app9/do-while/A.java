class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		do
		{
			System.out.println("from body:"+i);
			i++;
		}
		while (i<=5);
		System.out.println("main begin");
		System.out.println("main end");
	}
}
// no specific location only for boolean condition(@ the end)
//boolean condition has to varify at te second iteration