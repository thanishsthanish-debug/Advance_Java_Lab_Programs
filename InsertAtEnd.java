/* 3. Write a Java program to insert the specified element at the end 
   of a linked list using offerLast() */

package linkedlistprograms;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");

        list.offerLast("Pink"); // Command: offerLast()

        System.out.println(list);
    }
}