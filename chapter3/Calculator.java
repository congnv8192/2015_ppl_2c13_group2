public class Calculator
{
	static double first, second, value;
	static char operator;
	public static void main(String[] args)
    {
		while (true) {
            System.out.println("Enter expressions (enter \"0\" to exit) : ");
			first = TextIO.getDouble();
			if (first == 0) break;
			operator = TextIO.getChar();
			second = TextIO.getlnDouble();

			switch (operator) {
				case '+':
					value = first + second;
					break;
				case '-':
					value = first - second;
					break;
				case '*':
					value = first * second;
					break;
				case '/':
					value = first / second;
					break;
				default:
					System.out.println("Unknown operator: " + operator);
					continue;
			}
			System.out.println("Value is " + value);
			System.out.println();
		}
	}
}
