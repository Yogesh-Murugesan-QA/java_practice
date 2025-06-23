public class secondlargestarray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,3,4,5,2,4,5,9,9,1,1};
        int first= arr[0];
        int second= arr[0];
        for(int i=1;i<arr.length-1;i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second) {
                second= arr[i];
            }
            }
        System.out.println(first);
        System.out.println(second);
        }
    }