package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        HashSet<String> lio = new HashSet<String>();



        lio.add("anju");
        lio.add("abhi");
        lio.add("raghu");

        lio.stream().sorted().forEach(System.out::println);
        System.out.println("_----------------------");
        List<String> kio = new ArrayList<String>();

        kio.add("anju");
        kio.add("abhi");
        kio.add("sathi");
        kio.add("manam");
        kio.addAll(lio);
        Stream<String> data = kio.stream();
        data.sorted().forEach(System.out::println);
        System.out.println("_------------");
   Stream <String> anju=  kio.stream();
   anju.distinct().forEach(System.out::println);
        System.out.println("*******************");
    //Stream <String> abhi = kio.stream();
    //abhi.count();

        Stream<String> sip = kio.stream();
                sip.filter(pip-> {
            if (pip.equals("abhi")) {
                System.out.println("Found abhi ! Do something special");
                return true;
            }
            return false;
        }).forEach(System.out::println);

            ;
        }




}


