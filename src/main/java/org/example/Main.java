package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //HashSet: como podemos observar, no muestra valores repetidos.
        Set<Integer>  s = new HashSet<>();
        s.add(8);
        s.add(8);
        s.add(8);
        s.add(8);
        s.add(8);
        s.add(9);
        s.add(7);
        s.remove(8);
        s.remove(9);
        System.out.println(s);
        //HashMap
        var params = new HashMap<String,String>();
        params.put("version","1.0");
        params.put("user","Overion");
        System.out.println(params);
        System.out.println("Uso con for: ");
        for(String p: params.keySet()){
            System.out.println(p);
        }
        System.out.println("Uso con forEach:");
        System.out.println("---------------------------------");
        params.forEach(
                (k,v) -> System.out.println(k+": "+v+"/n---------------------------------")

        );
        }
    }