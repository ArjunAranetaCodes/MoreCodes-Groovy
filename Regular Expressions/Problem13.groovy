//Problem 13: Write a program that recognizes valid hex color value using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word1 = "#fff";
    String word2 = "#asdf";
    String pattern = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})\$";
    println(Pattern.matches(pattern, word1));
    println(Pattern.matches(pattern, word2));
  }
}