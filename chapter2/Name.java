public class Name
{
	static String input;
	static String[] parts;
	static String firstName;
	static String lastName;

	public static void main(String[] args)
    {
		System.out.println("Please enter your first name and last name, separated by a space.?");
		input = TextIO.getln();
		parts = input.split(" ");
		firstName = parts[0];
		lastName = parts[1];

		System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters.");
		System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters.");
		System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
	}
}
