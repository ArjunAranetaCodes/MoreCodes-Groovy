
class Problem10 {
 static void main(String[] args) {
  int num1 = 0;
  int num2 = 0;
  int num3 = 0;
  int ave = 0;

  Scanner sc = new Scanner(System.in);
  print("Enter value of num1: ");
  num1 = sc.nextInt();
  print("Enter value of num2: ");
  num2 = sc.nextInt();
  print("Enter value of num3: ");
  num3 = sc.nextInt();
  ave = (num1 + num2 + num3) / 3;

  println();
  println("Average is "  + ave);
 }
}


