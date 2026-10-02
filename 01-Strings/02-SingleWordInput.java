import java.util.Scanner;

public class SingleWordInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        System.out.println("You entered: " + word);

        sc.close();
    }
}
