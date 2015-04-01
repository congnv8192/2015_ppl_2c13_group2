public class Divisor
{
	static int n, max, num, count;
	public static void main(String[] args)
	{
		max = 1;
		num = 1;
		for (n = 2; n <= 10000; n++) {
			count = 0;
			for (int d = 1; d <= n; d++) {
				if (n % d == 0) count++;
			}
			if (count > max) {
				max = count;
				num = n;
			}
		}
		System.out.println("Among integers between 1 and 10000, the maximum number of divisors is " + max);
		System.out.println("A number with max divisors is " + num);
	}
}
