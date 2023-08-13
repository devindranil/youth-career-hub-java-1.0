package String;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        /*String name1 = "Indra";
        String name2 = "Indraanil";

        System.out.println(name1 == name2);*/

        //how to create diff objects of same values
        String a = new String("Indra");
        String b = new String("Indranil");

        //System.out.println(a==b);

        //euqals()

        //System.out.println(a.equals(b));

        //System.out.println(a.charAt(1));

        String name = "Indranil Chakraborty";
        //System.out.println(Arrays.toString(name.toCharArray()));
        //System.out.println(name.length());
        /*System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());*/

        String s = "This is demo";
        System.out.println(s.subSequence(3, 9));//end index-1 9-1=8
    }
}
