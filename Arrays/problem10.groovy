
class Problem10{
 static void main(String[] args){
  int[] arrNumbers = [1, 2, 3];
  int sum = 0;
  int ave = 0;

  for(int x : arrNumbers){
   sum = sum + x;
  }

  ave = sum / 3;

  println("Average is " + String.valueOf(ave));
 }
}


