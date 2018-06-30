//Problem 12: Write a program that counts the occurrence of digits in a string using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word = "Hello12 World12";
    String newWord = word.replaceAll("\\D", "");
    int count = newWord.length();

    println(count);
  }
}