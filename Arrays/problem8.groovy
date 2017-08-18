
class Problem8{
 static void main(String[] args){
  int[] arrNumbers = [1, 2, 3];
  int min = arrNumbers[0];

  for(int x : arrNumbers){
   if(x < min){
    min = x;
   }
  }

  println("Lowest number: " +
   String.valueOf(min));
 }
}


