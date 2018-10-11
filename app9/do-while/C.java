class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		do
		{
			int i=1;
			System.out.println("from body:"+i);
			i++;
		}
		while (i<=5);
		System.out.println("main begin");
		System.out.println("main end");
	}
}
//error
//2. which ever variable using in the body of do- while which cant be used in the boolean condition in the while