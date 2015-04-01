public class Sale
{
    static double salesTotal;
    static int missingCount;
    public static void main( String[] args )
    {
        try {
            TextIO.readFile("sales.dat");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Can't open file.");
            System.exit(1);
        }
        salesTotal = 0;
        missingCount = 0;

        while ( ! TextIO.eof() ) {
            char ch;
            String data;
            double sales;

            do {
                ch = TextIO.getChar();
            } while (ch != ':');

            data = TextIO.getln();

            try {
                sales = Double.parseDouble(data);
                salesTotal += sales;
            }
            catch (NumberFormatException e) {
                missingCount++;
            }
        }
        System.out.printf("Total sales recorded from all cities: $%1.2f\n\n", salesTotal);
        System.out.printf("Data was missing from %d cities.\n", missingCount);
    }
}
