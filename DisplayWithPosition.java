/* 4. Write a Java program to display elements and their positions 
   in a linked list using get() */

package linkedlistprograms;

import java.util.*;

public class DisplayWithPosition {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        for (int i = 0; i < list.size(); i++) { // Command: size()
            System.out.println("Position " + i + ": " + list.get(i)); // Command: get(index)
        }
    }
}