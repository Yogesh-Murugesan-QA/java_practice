import java.util.HashSet;

public class DuplicateString {
    public static void main(String[] args) {
        String input= "ASFBDABAHAWWDF";
        HashSet<Character> set1= new HashSet<>();
      for(int i = 0; i<input.length();i++){
          for (int j = i+1; j<input.length();j++){
              if (input.charAt(i)==input.charAt(j)){
                  set1.add(input.charAt(i));
              }
          }
      }
        System.out.println(set1);
    }
} 
