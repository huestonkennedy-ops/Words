import java.util.ArrayList;
public class Words {
    private ArrayList<String> words = new ArrayList<>();
    public Words() {

    }
    public boolean addWord(String word) {
        if (words.contains(word)) {
            System.out.println("Duplicate word! Skipping it!");
            return false;
        }
        System.out.println("Good word!");
        words.add(word);
        return true;
    }
    public String toString() {
        String list = "";
        for(String i: words) {
            list += i + ", ";
        }
        return list;
    }
}