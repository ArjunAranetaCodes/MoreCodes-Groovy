//Problem 6: Write a program that removes white space and non-visible characters.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word = "Hello World";
    String newWord = word.replaceAll("\\s", "");
    println(newWord);
  }
}