//Problem 17: Write a program that removes the last word in a string using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word = "Hello World";
    String newWord = word.replaceAll("\\w+\$", "");
    println(newWord);
  }
}