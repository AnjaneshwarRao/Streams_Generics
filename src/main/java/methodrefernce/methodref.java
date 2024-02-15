package methodrefernce;

import java.util.function.BiFunction;

public class methodref {

    public static <T> T concatOperation(T one, T two, BiFunction<T,T,T> ConcateOp){
        return ConcateOp.apply(one, two);
    }

    public static String ConcateName(String one,String two){
        return one+two;
    }
public String ConcateNamesForInstance(String one, String two){
        return one+two;
}

    public static void main(String[] args) {
        methodref method = new methodref();
        System.out.println(methodref.concatOperation("head","first", methodref::ConcateName));
        System.out.println(methodref.concatOperation("job", "first", method::ConcateNamesForInstance));
        System.out.println(methodref.concatOperation("learn","first", String::concat));
        System.out.println(methodref.concatOperation("anju","first",(one, two)->one +two ));
    }


}
