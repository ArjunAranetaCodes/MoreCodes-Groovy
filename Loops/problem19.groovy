
class Problem19{
 static void main(String[] args){
  PrintEven(10);
 }

 static int PrintEven(int num){
  if (num == 0){
   return num;
  }else{
   if (num % 2 == 0){
    println(num);
   }
   return PrintEven(num - 1);
  }
 }
}


