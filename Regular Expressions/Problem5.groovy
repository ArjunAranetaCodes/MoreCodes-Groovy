//Problem 5: Write a program that matches time in 24 hour format.
import java.util.regex.*;  
class Problem{
  static void main(String[]args){
    println(Pattern.matches("^(0?[1-9]|1[012])(:[0-5]\\d) [APap][mM]\$", "13:00"));
    println(Pattern.matches("^(0?[1-9]|1[012])(:[0-5]\\d) [APap][mM]\$", "8:01 am"));
  }
}