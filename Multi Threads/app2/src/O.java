class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000,500); //mill, nano
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
//* Sleep method is a Ststic Class//* 