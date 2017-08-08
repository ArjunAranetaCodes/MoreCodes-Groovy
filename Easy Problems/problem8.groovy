
class Problem8 {
 static void main(String[] args) {
  int sum = 0;

  for(int x = 0; x <= 30; x++){
   if(x % 5 == 0){
    sum = sum + x;
   }
  }

  println("Sum of numbers divisible by 5 from 1 to 30 is " +
   String.valueOf(sum));
 }
}


