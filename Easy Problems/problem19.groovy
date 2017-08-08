
class Problem19{
 static void main(String[]args){
  String word = "program";
  String vowels = "aeiou";
  int vowelCount = 0;

  for(int x = 0; x < word.length(); x++){
   if(vowels.contains(String.valueOf(word.charAt(x)))){
    vowelCount += 1;
   }
  }

  println("Total: " + String.valueOf(vowelCount));
 }
}


