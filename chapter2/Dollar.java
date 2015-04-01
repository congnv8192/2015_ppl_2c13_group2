public class Dollar
{
	static int quarters, dimes, nickels, pennies;
	static double dollars;
	public static void main(String[] args)
    {
		System.out.print("How many quarters do you have: ");
		quarters = TextIO.getlnInt();

		System.out.print("How many dimes do you have: ");
		dimes = TextIO.getlnInt();

		System.out.print("How many nickels do you have: ");
		nickels = TextIO.getlnInt();

		System.out.print("How many pennies do you have: ");
		pennies = TextIO.getlnInt();

		dollars = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies);
		System.out.printf("\nThe total in dollars is $%1.2f\n", dollars);
	}
}
