import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Words test = new Words();
        while(true) {
            test.addWord(scanner.nextLine());
            System.out.println(test);
        }
    }
}