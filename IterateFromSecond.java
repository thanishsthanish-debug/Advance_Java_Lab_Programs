/* 1. Write a Java program to iterate through all elements in a linked list 
   starting at the specified position (2nd) using iterator */

package linkedlistprograms;

import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(); // Command: create LinkedList

        list.add("Red");   // Command: add()
        list.add("Blue");
        list.add("Green");

        ListIterator<String> it = list.listIterator(1); // Command: listIterator(index)

        while (it.hasNext()) { // Command: hasNext()
            System.out.println(it.next()); // Command: next()
        }
    }
}