
class Problem3{
 static void main(String[] args){
  int[] arrNumbers = [1,1,2,3];
  int count = 0;

  for(int x : arrNumbers){
   if(x == 1){
    count = count + 1;
   }
  }

  print("Occurence: " +
   String.valueOf(count));
 }
}


