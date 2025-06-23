public class Largestarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,2,4,5,9,9,1,1};
        int largest= 0;
    for(int i=0; i<arr.length-1;i++) {
        for (int j = i + 1; j < arr.length - 1; j++) {
            if (arr[i] > arr[j]) {
              largest= arr[i];
            }
            else if (arr[j]>=arr[i]){
                largest= arr[j];
            }
        }
    }
    System.out.println(largest);
}}
