public class reverseCharacter {

    public static void main(String[] args) {
        String input = "YOGESH";
        String reversed = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println(reversed);
    }

}
