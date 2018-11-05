/*
Problem 8: Write a program to print the number pattern of ones and zeros using loop.
11111
11111
11011
11111
11111
*/
class Problem{
 static void main(String[] args){
  int row = 5;
  int col = 5;
  for(int y = 0; y < row; y++){
   for(int x = 0; x < col; x++){
    if(x == Math.floor(row / 2) && y == Math.floor(col / 2)){
     print("0");
    }else{
     print("1");
    }			
   }
   print("\n");
  }
 }
}