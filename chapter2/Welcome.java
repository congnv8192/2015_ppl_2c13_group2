import java.util.Scanner;
public class Welcome
{
	public static String name;
	public static Scanner scn = new Scanner(System. in );
	public static void main(String[] args)
    {
		System.out.println("Please input your name");
		name = scn.nextLine();
		System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");
	}
}
