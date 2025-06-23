import java.util.ArrayList;

public class countArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 1, 2, 3, 9, 8, 5, 3, 2, 2, 5};
        ArrayList<Integer> ab = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            int k=1;
            if (!ab.contains(a[i])) {
                ab.add(a[i]);

                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                    k++;
                    }
                }
                System.out.println(a[i] +" is occuring " + k +" time");
                if(k==1)
                    System.out.println(a[i]+" is a unique number");
            }
        }
    }
}
