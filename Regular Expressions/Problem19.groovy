//Problem 19: Write a program that counts all numbers in a string using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word = "Hello World123";
    int count = word.replaceAll("[^0-9]","").length();
    println(count);
  }
}