//Problem 7: Write a program that counts vowels in a String using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word = "Hello World";
    int count = word.replaceAll("[^aeiouAEIOU]","").length();
    println(count);
  }
}