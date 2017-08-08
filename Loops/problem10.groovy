
class Problem10{
 static void main(String[]args){
   int num = 371;
   int sum = 0;
   int temp = 0;
   int rmdr = 0;

   temp = num;

   while (temp != 0){
    rmdr = temp % 10;
    sum = sum + (rmdr * rmdr * rmdr);
    temp = temp / 10;
   }

   if (num == sum){
    println("Armstrong number");
   }else {
    println("Not an Armstrong number");
   }
 }
}


