package src;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
    private Set<Integer> hashSet;
    private Set<Integer> treeSet;

    public SetComparison() {
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>();
    }

    public void addElements(Set<Integer> set, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            set.add(i);
        }
    }

    public void displaySet(Set<Integer> set) {
        System.out.print("Set elements: ");
        for (int element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void comparePerformance() {
        long startTime, endTime;
        int numberOfElements = 10;
        startTime = System.currentTimeMillis();
        addElements(hashSet, numberOfElements);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to add elements to HashSet: " + (endTime - startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        addElements(treeSet, numberOfElements);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to add elements to TreeSet: " + (endTime - startTime) + " milliseconds");
        System.out.println("HashSet elements:");
        displaySet(hashSet);
        System.out.println("TreeSet elements:");
        displaySet(treeSet);
    }
        public static void main (String[]args){
            SetComparison setComparison = new SetComparison();
            setComparison.comparePerformance();
        }
    }
