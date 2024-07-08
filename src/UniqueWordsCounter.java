package src;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsCounter {
    private Set<String>uniqueWords;
    public UniqueWordsCounter(){
        uniqueWords=new HashSet<>();
    }
    public void readFile(String fileName){
        for(String word:uniqueWords){
            uniqueWords.add(word);
        }
    }
}
