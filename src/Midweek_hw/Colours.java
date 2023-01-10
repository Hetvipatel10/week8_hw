package Midweek_hw;

import java.util.ArrayList;

public class Colours {
    public static void main(String[] args) {
        ArrayList<String>colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");

        // Print out the colors using a for-each loop
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
