package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    AverageOfNumbers a = new AverageOfNumbers();
        ArrayList arr = new ArrayList<Integer>(6);
        arr.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(a.getAverage(arr));
        A3Letters a3 = new A3Letters();
        ArrayList strs = new ArrayList(6);
        strs.addAll(Arrays.asList("aaa","aaaa","abc","aca","qwerty","hello"));
        for (Object s:a3.filterStrings(strs)
             ) {
            System.out.println(s);
        }
        PalindromeStrings pals = new PalindromeStrings();
        for (Object s: pals.filterPalindromes(strs)){
            System.out.println(s);
        }
    }
}
