//Problem 20: Write a program that converts a number to its 
//corresponding month (e.g. 1 = January).
class Problem20{
 static void main(String[]args){
  int index = 1;
  String[] month = ["January", "February", "March", "April",
   "May", "June", "July", "August",
   "September", "October", "November", "December"];

  println(month[index - 1]);
 }
}