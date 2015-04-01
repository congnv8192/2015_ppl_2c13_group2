public class Word
{
    static String line;
    static boolean printLn;
    public static void main(String[] args)
    {
        System.out.println("Enter a line of text: ");
        line = TextIO.getln();
        printLn = true;
        for(int i = 0;i<line.length();i++){
            char ch = line.charAt(i);
            if ( Character.isLetter(ch) || (ch == '\'' && Character.isLetter(line.charAt(i-1)) && Character.isLetter(line.charAt(i+1)) ) ) {
                System.out.print(ch);
                printLn = false;
            }
            else {
                if ( printLn == false ) {
                    System.out.println();
                    printLn = true;
                }
            }
        }
        System.out.println();

    }
}
