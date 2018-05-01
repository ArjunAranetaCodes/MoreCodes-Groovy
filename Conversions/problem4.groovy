//Problem 4: Write a program that converts a string to array/list.
class Problem4{
 static void main(String[]args){
  String numbers = "1,2,3";
  String[] arrNumbers = numbers.split(",");
  for(String x : arrNumbers){
   println(x);
  }
 }
}
