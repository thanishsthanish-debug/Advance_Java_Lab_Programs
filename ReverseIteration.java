/* 2. Write a Java program to iterate a linked list in reverse order 
   using descendingIterator() */

package linkedlistprograms;

import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        Iterator<String> it = list.descendingIterator(); // Command: descendingIterator()

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}