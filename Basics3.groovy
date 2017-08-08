//Variables and Input

class program {
 static void main(String[] args) {
  String name = "";
  char sex;
  int age = 0;

  Scanner sc = new Scanner(System.in);
  print("What is your name? ");
  name = sc.nextLine();
  print("What is your sex? ");
  sex = sc.nextLine().charAt(0);
  print("What is your age? ");
  age = sc.nextInt();

  println();
  println("Name: " + name);
  println("Sex: " + sex);
  println("Age: " + age);
 }
}



