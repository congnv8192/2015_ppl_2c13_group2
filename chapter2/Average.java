public class Average
{
	static String name;
	static int exam1, exam2, exam3;
	static double average;
	public static void main(String[] args)
    {
		TextIO.readFile("testdata.txt");
		name = TextIO.getln();
		exam1 = TextIO.getlnInt();
		exam2 = TextIO.getlnInt();
		exam3 = TextIO.getlnInt();
		average = (exam1 + exam2 + exam3) / 3.0;
		System.out.printf("The average grade for %s was %1.1f", name, average);
		System.out.println();
	}
}
