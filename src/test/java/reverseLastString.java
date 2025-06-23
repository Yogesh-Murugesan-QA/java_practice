public class reverseLastString {
    public static void main(String[] args) {
    String a = "ITS MONDAY";
    String [] words= a.split(" ");
    String lastword= words[words.length-1];
    String reversedlast="";
    for (int i=lastword.length()-1; i>=0;i--){
        reversedlast += lastword.charAt(i);

    }
    // Replace last word
    words[words.length-1]= reversedlast;
    String result= String.join(" ",words);
    System.out.println(result);
    }
}
