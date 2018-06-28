//Problem 10: Write a program that prints an integer with commas separator using Regular Expression.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    String number = "1000";
    String newnum = number.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,");
    println(newnum);
  }
}