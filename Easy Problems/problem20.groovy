
class Problem20{
 static void main(String[]args){
  String word = "anna";
  String tempWord = new StringBuffer(word).reverse().toString();

  if(word.equals(tempWord)){
   println("Palindrome");
  }else{
   println("Not Palindrome");
  }
 }
}


