/*
Problem 19: Write a program to print the number pattern using loop.
11 11
11 11
   
11 11
11 11
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
					print(" ");
				}else if((col % 2 == 0 && newcol == x) || 
				 (row % 2 == 0 && newrow == y)){
				 print(" ");
				}else{
				 print("1");
				}		
			}
			print("\n");
		}
 }
}