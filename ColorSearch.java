/* 1. Write a java program for getting different colors through ArrayList interface 
   and search whether the color "Red" is available or not */

package arraylistprograms;

import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(); // Command: create ArrayList

        colors.add("Blue");    // Command: add()
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        if (colors.contains("Red")) { // Command: contains()
            System.out.println("Red is available");
        } else {
            System.out.println("Red is not available");
        }
    }
}