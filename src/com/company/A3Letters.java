package com.company;

import java.util.ArrayList;

public class A3Letters {
    Object[] filterStrings(ArrayList<String> s){
        return s.stream().filter(x-> x.charAt(0)=='a' && x.length()==3).toArray();
    }
}
