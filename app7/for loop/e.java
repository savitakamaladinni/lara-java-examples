class e
{

	public static void main(String[] args) 
	{
		int i=1;
		for(;  ;)
		{
		System.out.println("loop body:"+i);
		i++
		System.out.println("main end");//is unreachable
	}
}
/* o/p
compilation error
always boolean condition is true
infinite for loop by default it will consider true