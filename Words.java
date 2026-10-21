import java.util.ArrayList;
public class Words {
    private ArrayList<String> words = new ArrayList<>();
    public Words() {

    }
    public void addWord(String word) {
        for(String i: words) {
            if(word.equals(i)) {
                System.out.println("Duplicate word! Skipping it"); 
                return;
            }
        }
        System.out.println("Good word!");
        words.add(word);
    }
    public String toString() {
        String list = "";
        for(String i: words) {
            list += i + ", ";
        }
        return list;
    }
}