public class SnakeEye
{
	static int die1, die2;
	static int count;

	public static void main(String[] args)
    {
		count = 0;
		do {
			die1 = (int)(Math.random() * 6) + 1;
			die2 = (int)(Math.random() * 6) + 1;
			count++;
		} while (die1 != 1 || die2 != 1);
		System.out.println("It took " + count + " rolls to get snake eyes.");
	}
}
