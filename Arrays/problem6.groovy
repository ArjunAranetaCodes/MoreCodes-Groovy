
class Problem6{
 static void main(String[]args){
  int[] arrNumbers = [1,2,3];
  int count = 0;

  for(int x : arrNumbers){
   if(x == 2){
    count = count + 1;
   }
  }

  if(count > 0){
   println("Contains 2");
  }else{
   println("Does not contain 2");
  }
 }
}


