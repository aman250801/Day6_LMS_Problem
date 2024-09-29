package com.lmsDay6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {
	public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");

        // Print the original list
        System.out.println("Original list: " + stringList);

        // Reverse the list
        Collections.reverse(stringList);

        // Print the reversed list
        System.out.println("Reversed list: " + stringList);
    }

}
