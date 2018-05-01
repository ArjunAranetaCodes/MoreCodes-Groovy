//Problem 6: Write a program that converts a binary number to decimal number.
class Problem6{
 static void main(String[]args){
  int dec = 0;
  String binary = "110";

  String reverse = new StringBuffer(binary).reverse().toString();

  for (int x = 0; x < reverse.length(); x++){
   if (reverse.charAt(x) == '1'){
    dec = dec + (int)Math.pow(2, x);
   }
  }

  println(dec);
 }
}