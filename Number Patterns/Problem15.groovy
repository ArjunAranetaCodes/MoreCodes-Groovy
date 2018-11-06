/*
Problem 15: Write a program to print the number pattern using loop.
11111
2222
333
44
5
*/
class Problem{
 static void main(String[] args){
		int row = 5;
		int num = 1;
		for(int y = row; y > 0; y--){
			for(int x = 0; x < y; x++){
				print(num);
			}
			num = num + 1;
			println();
		}
 }
}