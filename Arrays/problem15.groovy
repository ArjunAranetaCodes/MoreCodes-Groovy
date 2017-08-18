
class Problem15{
 static void main(String[]args){
  int[] array1 = [1,2,3];
  int[] array2 = new int[3];

  array2 = Arrays.copyOf(array1,3);

  for(int x : array2){
   println(x);
  }
 }
}


