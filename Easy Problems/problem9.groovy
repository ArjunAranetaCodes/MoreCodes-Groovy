
class Problem9 {
 static void main(String[] args) {
  int num = 0;
  int sum = 0;

  Scanner sc = new Scanner(System.in);
  print("Enter value of num: ");
  num = sc.nextInt();

  for(int x = 0; x <= num; x++){
   sum = sum + x;
  }

  println("The sum of 1 to " + String.valueOf(num) +
  " is " + String.valueOf(sum));
 }
}


