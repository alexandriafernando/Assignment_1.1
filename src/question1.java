import java.util.Scanner;
public class question1 {
    public static void main(String args[])
    {
        int counter[] = new int[256];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String x = scanner.nextLine();
        int y = x.length();
        for (int i = 0; i < y; i++)
        {
            counter[(int) x.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++)
        {
            if (counter[i] != 0)
            {

                System.out.print("" +(char) i + counter[i]);
            }
        }
    }  }