//Problem 7: Write a program that converts a decimal number to binary number.
class Problem7{
 static void main(String[]args){
  int dec = 10;
  String binary = "";

  while (dec > 0){
   binary = String.valueOf(dec % 2) + binary;
   dec = dec / 2;
  }
  println(binary);
 }
}