
class Problem7{
 static void main(String[] args){
  int[] arrNumbers = [1, 2, 3];
  int max = 0;

  for(int x : arrNumbers){
   if(x > max){
    max = x;
   }
  }

  println("Largest number: " +
   String.valueOf(max));
 }
}


