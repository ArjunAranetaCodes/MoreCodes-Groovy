
class Program {
 static void main(String[] args) {
  double radius = 0.0;
  double dia = 0.0;
  double pi = 3.14;
  double area = 0.0;
  double cir = 0.0;

  Scanner sc = new Scanner(System.in);
  print("Enter value of radius: ");
  radius = sc.nextFloat();
  dia = radius * radius;
  area = pi * dia;
  cir = 2.0 * pi * radius;


  println();
  println("Diamter of Circle is "  + dia);
  println("Area of Circle is "  + area);
  println("Circumference of Circle is "  + cir);
 }
}


