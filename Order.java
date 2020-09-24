class Order
{
	public static void main(String[] args)
	{
		String word="DAC00034AFG";
		String s1=word.substring(0,3);
		String s2=word.substring(3,8);
		String s3=word.substring(8,11);
		System.out.println(s3+s2+s1);	
	}
}
