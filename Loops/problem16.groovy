
class Problem16{
 static void main(String[]args){
   int num = 5;
   int fact = 1;

   for (int x = num; x >= 1; x--){
    fact = fact * x;
   }
   print("Factorial of 5 is " + String.valueOf(fact));
 }
}


