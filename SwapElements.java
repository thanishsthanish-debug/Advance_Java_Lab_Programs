/* 5. Write a Java program that swaps two elements (first and third elements) 
   in a linked list using Collections.swap() */

package linkedlistprograms;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        Collections.swap(list, 0, 2); // Command: Collections.swap()

        System.out.println(list);
    }
}