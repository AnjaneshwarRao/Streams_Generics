package Genrics;

public class Generic_method {


        public static <T> T method(T[] array){
            for(T element: array){
                System.out.print(element +" ");


            }

            return array[1];
        }
        public static void main(String[] args) {

            Integer[] intarray ={1,23,12,10};

            Double[] doublearray = {11.1, 23.12, 7.12};
            method(intarray);
            System.out.println("**************");
            method(doublearray);
    }
}
