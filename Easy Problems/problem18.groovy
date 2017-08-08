
class Problem18{
 static void main(String[]args){
  String word = "program";
  String letter = "a";
  int letterCount = 0;

  for(int x = 0; x < word.length(); x++){
   if(letter.contains(String.valueOf(word.charAt(x)))){
    letterCount += 1;
   }
  }

  println("Total: " + String.valueOf(letterCount));
 }
}


