
class Problem2{
 static void main(String[]args){
  int[] arrNumbers = [1,2,3];
  int indexOfNum =  0;

  for(int x = 0; x < arrNumbers.length; x++){
   if(arrNumbers[x] == 2){
    indexOfNum = x;
    break;
   }
  }

  println(indexOfNum);
 }
}


