/*
Problem 4: Write a program to print the number pattern of ones and zeros using loop.
10001
10001
10001
10001
10001
*/
class Problem{
 static void main(String[] args){
  for(int y = 0; y < 5; y++){
   for(int x = 0; x < 5; x++){
    if((x == 0) || (x == 4)){
     print("1");
    }else{
     print("0");
    }			
   }
   print("\n");
  }
 }
}