package Genrics;

public class Genric_Main {

    public static void main(String[] args) {
        Genriclass <Integer, Integer> intone = new Genriclass <>(1,4);
     //  Genriclass<String> stringone = new Genriclass<>( "anju");
        Genriclass<Double, Integer> doubleone = new Genriclass<>(22.12d, 23.12d);
       // Genriclass<Integer,git reset --hard origin/maingit reset --hard origin/main Double> floatone = new Genriclass<>(12, 12.22d);


       // Genriclass<HashSet<Integer>> Hastsetone = new Genriclass<>(new HashSet<>(Set.of(12,11,14,8)));
      //  Genriclass<Integer []>  array = new Genriclass<>(new Integer [] {1,12,23});
     //   int [] array = {1,23,4,2};
        System.out.println(intone.getX());
        System.out.println(doubleone.getX());
     //   System.out.println(floatone.getX());
    //    System.out.println(stringone.getX());
       // System.out.println(Hastsetone.getX());
       // System.out.println(array.getX());


     //   Integer [] value = array.getX();
   //     for(Integer sizes : value){
       //     System.out.println("the value of it is" + sizes);
        }
    }

