package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamrepaet {

    public static void main(String[] args) {
        List<String> kio = new ArrayList<>();
        Set<String> lio = new HashSet<>();
        HashMap<Integer, String>  jio = new  HashMap<Integer, String>();
        jio.put(1,"anju");
        jio.put(2, "abhi");
        jio.put(3, "anju");
        jio.put(3, "lio");

        Stream< Integer> hip  = jio.keySet().stream();
        Set<String> flatnnedvalues = hip.flatMap(key->Stream.of(jio.get(key)))
                        .collect(Collectors.toSet());

        System.out.println("Flattened Map" + flatnnedvalues);
        System.out.println("*******************");
        lio.add("anju");
        lio.add("abhi");
        lio.add("raghu");

        Stream<String> pig = lio.stream();
      //  pig.flatMap(Set::stream).collect(Collectors.toSet());
        kio.add("anju");
        kio.add("abhi");
        kio.add("sathi");
        kio.add("manam");
        kio.addAll(lio);

        // Sorting and printing elements
        System.out.println("Sorted elements:");
        kio.stream().sorted().forEach(System.out::println);
        System.out.println("--------------");

        // Creating a new stream 'anju', printing distinct elements
        System.out.println("Distinct elements (anju):");
        kio.stream().distinct().forEach(System.out::println);
        System.out.println("--------------");

        // Creating a new stream 'abhi' and counting elements
        System.out.println("Count of elements (abhi):");
        long abhiCount = kio.stream().count();
        System.out.println("Count: " + abhiCount);
        System.out.println("--------------");

        // Creating a new stream 'sip' and filtering elements
        System.out.println("Filtered elements (sip):");
        kio.stream().filter(pip -> {
            if (pip.equals("abhi")) {
                System.out.println("Found abhi! Do something special");
                return true;
            }
            return false;
        }).forEach(System.out::println);


    }
}
