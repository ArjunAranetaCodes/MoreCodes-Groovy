/*
Problem 9: Write a program to print the number pattern of ones and zeros using loop.
11011
11011
00000
11011
11011
*/
class Problem{
 static void main(String[] args){
  int row = 5;
  int col = 5;
  for(int y = 0; y < row; y++){
   for(int x = 0; x < col; x++){
    int newcol = Math.floor(col / 2);
    int newrow = Math.floor(row / 2);
    if(newcol == x || newrow == y){
        print("0");
    }else if((col % 2 == 0 && newcol == x) || (row % 2 == 0 && newrow == y)){
        print("0");
    }else{
        print("1");
    }		
   }
   print("\n");
  }
 }
}