package com.syntax;

import java.util.HashSet;
import java.util.Set;

public class repl195 {
    public static void main(String[] args) {
        Set<Integer> no=new HashSet<>();
        no.add(111);
        no.add(111);
        no.add(111);
        no.add(999);
        no.add(999);
        no.add(999);
      for (int number:no){
          System.out.println(number);
      }

    }
}
