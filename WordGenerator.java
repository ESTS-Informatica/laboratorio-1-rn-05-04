import java.util.ArrayList;
import java.util.Random;

public class WordGenerator {
    ArrayList<String> words;
    
    public WordGenerator() {
        words = new ArrayList<String>();
    }
    
    private void fillArrayList() {
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    
    private String generateWord() {
        Random rnd = new Random();
        
        int rndNumber = rnd.nextInt(words.size());
        
        return words.get(rndNumber);
    }
}