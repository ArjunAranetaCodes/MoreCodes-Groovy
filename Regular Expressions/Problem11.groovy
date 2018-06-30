//Problem 11: Write a program that counts the occurrence of a string in a string using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String hello = "HelloWorldHelloWorld";
    Pattern pattern = Pattern.compile("Hello");
    Matcher  matcher = pattern.matcher(hello);

    int count = 0;
    while (matcher.find())
        count++;

    println(count);
  }
}