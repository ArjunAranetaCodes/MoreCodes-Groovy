
class Problem3{
 static void main(String[]args){
  String word = "MoreCodes";
  int wordCount = 0;

  for (char ch: word.toCharArray()) {
   wordCount++;
  }

  print("String Length: " + String.valueOf(wordCount));
 }
}


