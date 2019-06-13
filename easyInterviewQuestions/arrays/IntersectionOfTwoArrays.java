package arrays;
/**
* Problem Statement:
* Find intersection of two unsorted arrays of size m and n.
* Solution should be of time complexity O(m+n).
*/
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int [] intersectionOfArrays(int[] arr1, int [] arr2){
        HashSet<Integer> largerSet = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        if(arr1.length > arr2.length){
            for(int num: arr1){
                largerSet.add(num);
            }
            for(int num: arr2){
                if(largerSet.contains(num)){
                    intersectionSet.add(num);
                }
            }
        }else{
            for(int num: arr2){
                largerSet.add(num);
            }
            for(int num: arr1){
                if(largerSet.contains(num)){
                    intersectionSet.add(num);
                }
            }
        }
        int[] result = new int[intersectionSet.size()];
        int counter = 0;
        for(int num: intersectionSet){
            result[counter++] = num;
        }
        return result;
    }
}
