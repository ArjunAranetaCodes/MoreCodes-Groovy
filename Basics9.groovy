//Basics of Functions

class functions{
 static void main(String[]args){
  function1();
  function2(5);
  println("It's true! 1+1 = " + function3());
  println("Hi " + function4("More","Codes"));
 }

 //function that has no return value and no passing argument/parameter
 static void function1(){
  println("Hello there!");
 }

 //function that has no return value but has passing argument/parameter
 static void function2(int num){
  println("That number is " + num);
 }

 //function that has return value but has no passing argument/parameter
 static int function3(){
  int sum = 1 + 1;
  return sum;
 }

 //function that has return value and has passing argument/parameter
 static String function4(String firstName, String lastName){
  String fullName = firstName + " " + lastName;
  return fullName;
 }
}



