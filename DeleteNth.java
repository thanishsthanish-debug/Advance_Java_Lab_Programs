/* 5. Write a java program for getting different colors through ArrayList interface 
   and delete nth element using remove by index */

package arraylistprograms;

import java.util.*;

public class DeleteNth {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        int n = 2; // delete 2nd element

        colors.remove(n - 1); // Command: remove(index)

        System.out.println(colors);
    }
}