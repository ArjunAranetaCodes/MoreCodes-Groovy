
class Problem14{
 static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   int num = 0;
   int sum = 0;
   int ave = 0;

   for (int x = 0; x < 5; x++){
    print("Enter a number: ");
    num = scan.nextInt();
    sum = sum + num;
   }
   ave = sum / 5;
   println("Average is " + String.valueOf(ave));
 }
}


