class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=10;
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
// do-while
//1. minimum 1 time body execution is mandatory...no matter what is initial values and boolean expression
// 2. which ever variable using in the body of do- while which cant be used in the boolean condition in the while
// 3.while (should end with ;)
