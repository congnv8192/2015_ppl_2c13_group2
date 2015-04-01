public class Die
{
	private static int first, second;
	public static int roll()
    {
		return (int)(Math.random() * 6) + 1;
	}
	public static void main(String[] args)
    {
		first = roll();
		second = roll();
		System.out.println("The first die comes up " + first);
		System.out.println("The second die comes up " + second);
		System.out.println("Your total roll is " + (first + second));
	}
}
