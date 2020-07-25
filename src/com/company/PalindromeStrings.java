package com.company;

import java.util.ArrayList;

public class PalindromeStrings {
    boolean isPal(String s){
        int len = s.length();
        for(int i=0,j=len-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
    Object[] filterPalindromes(ArrayList<String> s){
        return s.stream().filter(x-> isPal(x)).toArray();
    }
}
