import java.util.HashMap;

public class TwoSum {
    public static int [] Twosum(int [] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int [] {map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return new int [] {};
    }
    public static void main(String[] args){

        int [] arr = {2,7,11,15};
        int target = 9;
        Twosum(arr,target);
    }
}
