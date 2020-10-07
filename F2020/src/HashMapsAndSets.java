import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapsAndSets {

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 4, 1, 2};

        HashSet<Integer> set = new HashSet(Arrays.asList(arr));
        Set<Integer> mySet = Arrays.stream(arr).boxed().collect(Collectors.toSet());


        System.out.println(Arrays.toString(set.toArray()));

        System.out.println(set.contains(1));

        System.out.println(solution(arr));
        // sorting hashmap by value

    }


    public static int solution(int[] A) {
        // write your code in Java SE 11

        Set<Integer> mySet = new HashSet(Arrays.asList(A));

        for (int i = 1; i < 1000000; i++) {
            if ( !(mySet.contains(i)) ){
                return i;
            }
        }

        return -1;
    }

}

