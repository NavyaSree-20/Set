package src;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedElements {
    private Set<String> elements;
    public OrderedElements(){
        elements=new LinkedHashSet<>();
    }
    public void addElement(String element){
        elements.add(element);
    }
    public void displayElements(){
        System.out.print("Elements in the insertion order: ");
        for(String element:elements){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OrderedElements elementsManager=new OrderedElements();
        elementsManager.addElement("Apple");
        elementsManager.addElement("Pinky");
        elementsManager.addElement("orange");
        elementsManager.addElement("Apple");
        elementsManager.displayElements();
    }
}
