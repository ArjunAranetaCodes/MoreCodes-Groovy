//Problem 16: Write a program that takes a value inside a <a> tag using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String word = "<a>Hello World</a>";
    String newWord = word.replaceAll("<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>", "");
    println(newWord);
  }
}