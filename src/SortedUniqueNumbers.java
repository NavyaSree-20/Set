package src;
import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueNumbers {
    private Set<Integer> numbers;
public SortedUniqueNumbers(){
    numbers=new TreeSet<>();
}
public void addNumber(int number){
    numbers.add(number);
}
public void displayNumbers(){
    System.out.print("sorted unique numbers");
    for(int number:numbers){
        System.out.print(number+" ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        SortedUniqueNumbers numbersManager=new SortedUniqueNumbers();
        numbersManager.addNumber(7);
        numbersManager.addNumber(89);
        numbersManager.addNumber(4);
        numbersManager.addNumber(7);
        numbersManager.addNumber(89);
        numbersManager.addNumber(5);
        numbersManager.displayNumbers();
    }
}
