/*
Problem 13: Write a program to print the pattern of asterisks using loop.
*
**
***
****
*****
****
***
**
*
*/
class Problem{
 static void main(String[] args){
		int row = 5;
		for(int y = 0; y <= row; y++){
			for(int x = 0; x < y; x++){
				print("*");
			}
			print("\n");
		}
		
		for(int y = row - 1; y > 0; y--){
			for(int x = 0; x < y; x++){
				print("*");
			}
			print("\n");
		}
 }
}