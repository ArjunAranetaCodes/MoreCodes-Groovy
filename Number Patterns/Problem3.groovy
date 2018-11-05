/*
Problem 3: Write a program to print the number pattern of ones and zeros using loop.
01010
01010
01010
01010
01010
*/
class Problem{
 static void main(String[] args){
  for(int y = 0; y < 5; y++){
   for(int x = 0; x < 5; x++){
    if(x % 2 == 0){
     print("0");
    }else{
     print("1");
    }			
   }
   print("\n");
  }
 }
}