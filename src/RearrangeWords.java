import java.util.*;
class RearrangeWords {
public static void main(String[] args){
    String sentence="Java is a programming language";
//    rearrangeWords(sentence);
    System.out.print(rearrangeWords(sentence));
    }
    static String rearrangeWords(String s){
    s=s.toLowerCase();
    String[] splited=s.split(" ");
    Arrays.sort(splited, Comparator.comparingInt(String::length));
    String result=String.join(" ",splited);
    return Character.toUpperCase(result.charAt(0))+result.substring(1);
    }
}