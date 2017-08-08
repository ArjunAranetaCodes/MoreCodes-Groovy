
class Program {
 static void main(String[] args) {
  double celsius = 0.0;
  double farenheit = 0.0;

  Scanner sc = new Scanner(System.in);
  print("Enter value of celsius: ");
  celsius = sc.nextFloat();

  farenheit = (9.0/5.0) * celsius + 32.0;

  println();
  println(celsius + "C equals to "  + farenheit + "F");
 }
}


