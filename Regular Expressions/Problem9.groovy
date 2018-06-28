//Problem 9: Write a program that checks if the string is alphanumeric using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word = "HelloWorld";
    String word2 = "HelloWorld123";
    Pattern pattern = Pattern.compile("(([A-Z].*[0-9])|([0-9].*[A-Z]))");
    boolean isalphanum = pattern.matcher(word).find();
    println(isalphanum);
    boolean isalphanum2 = pattern.matcher(word2).find();
    println(isalphanum2);
  }
}