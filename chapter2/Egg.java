public class Egg
{
	static int eggs;
	static int gross;
	static int outOfGross;
	static int dozens;
	static int extras;
	public static void main(String[] args)
    {
		System.out.print("How many eggs do you have?  ");
		eggs = TextIO.getlnInt();

		gross = eggs / 144;
		outOfGross = eggs % 144;

		dozens = outOfGross / 12;
		extras = outOfGross % 12;

		System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozen, and " + extras);
	}
}
