
class Program {
 static void main(String[] args) {
  int num1 = 0;
  int num2 = 0;
  int sum = 0;

  Scanner sc = new Scanner(System.in);
  print("Enter value of num1: ");
  num1 = sc.nextInt();
  print("Enter value of num2: ");
  num2 = sc.nextInt();
  sum = num1 + num2;

  println();
  println("Sum is "  + sum);
 }
}


