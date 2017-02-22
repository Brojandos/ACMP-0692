import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int numberToBeTested = new Scanner(System.in).nextInt();
        int testingNumber = 1;
        while  (numberToBeTested >= testingNumber) {
            if (numberToBeTested == testingNumber) {
                System.out.println("YES");
                return;
            }
            testingNumber *= 2;
        }
        System.out.println("NO");
    }
}
