import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Words test = new Words();
        boolean myBool = true;
        while(myBool == true) {
            myBool = test.addWord(scanner.nextLine());
            System.out.println(test);
        }
    }
}