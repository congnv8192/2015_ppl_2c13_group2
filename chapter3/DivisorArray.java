public class DivisorArray
{
    static int n;
    static int max;
    static int[] saveCount;
    public static void main(String[] args)
    {
        saveCount = new int[10001];
        max = 1;
        saveCount[1] = 1;

        for ( n = 2;  n <= 10000;  n++ ) {
            int d, count;
            count = 0;
            for ( d = 1;  d <= n;  d++ ) {
                if ( n % d == 0 ) count++;
            }
            saveCount[n] = count;
            if (count > max) {
                max = count;
            }
        }

        System.out.println("The maximum number of divisors was " + max);
        System.out.println("Numbers with that many divisors include:");
        for ( n = 1; n <= 10000; n++ ) {
           if ( saveCount[n] == max ) {
               System.out.println( "   " + n );
           }
        }

    }

}
