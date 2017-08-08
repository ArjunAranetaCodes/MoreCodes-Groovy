
class Problem20{
 static void main(String[] args){
  println("Sum is " + GetSum(10, 0));
 }

 static int GetSum(int num, int sum){
  if (num == 0){
   return sum;
  }else{
   return GetSum((num - 1), (sum + num));
  }
 }
}


