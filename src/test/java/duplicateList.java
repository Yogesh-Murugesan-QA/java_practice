import java.util.ArrayList;
import java.util.Collections;

import static javax.swing.UIManager.get;

public class duplicateList {
    public static void main(String[] args) {
        ArrayList <Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        Collections.sort(arr);
        for (int i: arr ){
            System.out.println(i);
        }
        for (int i=0; i< arr.size();i++){
            for(int j=i+1; j< arr.size();j++){
                if(arr.get(i).equals(arr.get(j))){
                    System.out.println("duplicate is:"+ arr.get(i));
                }
            }

        }
    }
}