/**
 * Created by Lenovo on 9/2/2016.
 */
public class debbugerClass {

    public static void main(String[] args) {
        String firstLine = "first string";
        String secondLine = "second string";

        String result;


        result = concatenateStrings(firstLine, secondLine);
        for (int i =0; i>10; ++i){
            System.out.println(i);
        }

    }
    public static String concatenateStrings(String s1, String s2){
        System.out.println("Concatenate strings");
        System.out.println("===================");
        return s1+s2;
    }
}
