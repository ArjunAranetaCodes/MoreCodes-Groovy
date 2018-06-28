//Problem 8: Write a program that checks if the String if valid url using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word = "http://www.example.com";
    String word2 = "wwwexamplecom";
    String pattern = "^(https?:\\/\\/)?(www\\.)?([\\w]+\\.)+[‌​\\w]{2,63}\\/?\$";
    println(Pattern.matches(pattern, word));
    println(Pattern.matches(pattern, word2));
  }
}