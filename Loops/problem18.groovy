
class Problem18{
 static void main(String[] args){
  for (int x = 0; x <= 11; x++){
   println(Fibonacci(x));
  }
 }

 static int Fibonacci(int num){
  if ((num == 1) || (num == 0)){
   return num;
  }else{
   return Fibonacci(num - 1) + Fibonacci(num - 2);
  }
 }
}


