
class Problem13{
 static void main(String[]args){
   String word = "MoreCodes";
   String newWord = "";

   for (int x = word.length() - 1; x >= 0; x--){
    newWord = newWord + word.charAt(x);
   }
   println(newWord);
 }
}


