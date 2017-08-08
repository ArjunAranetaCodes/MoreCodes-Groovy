
class Program {
 static void main(String[] args) {
  int length = 0;
  int width = 0;
  int area = 0;

  Scanner sc = new Scanner(System.in);
  print("Enter value of length: ");
  length = sc.nextInt();
  print("Enter value of width: ");
  width = sc.nextInt();
  area = length * width;

  println();
  println("Area of Rectangle is "  + area);
 }
}


