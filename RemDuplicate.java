
import java.util.HashSet;

public class RemDuplicate {
    public static int Duplicate(int [] arr){
        HashSet<Integer> map = new HashSet<>();
        for (int key : arr) {
                map.add(key);
        }
        return map.size();
    }

    public static int Dup(int [] arr){
        int unique = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                arr[unique] = arr[i];
                unique++;
            }
        }
        return unique;
    }
    public static void main(String[] args){
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int dup = Duplicate(arr);
        int dup2 = Dup(arr);
        System.out.println("Using HashSet :"+dup);
        System.out.println("Using Simple Methods :"+dup2);
    }
}
