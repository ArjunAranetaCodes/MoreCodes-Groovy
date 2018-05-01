//Problem 10: Write a program that converts a decimal number to octal number.
class Problem10{
 static void main(String[]args){
  int dec = 256;
  String oct = "";

  while (dec > 0){
   oct = String.valueOf(dec % 8) + oct;
   dec = dec / 8;
  }
  println(oct);
 }
}