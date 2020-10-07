import java.util.Comparator;
import java.util.List;

public class CustomCompare {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12);

        Integer[][] myMatrix = { {1, 6}, {2, 5}, {3, 4} };

        nums.stream();


    }

}
class SortGeneric<T> implements Comparator<T>
{
    public int compare(T a, T b){
//        return a.compareTo(b);
        return 1;
    }
}
class SortBy2ndElement implements Comparator<Integer[]>
{
    public int compare(Integer[] a, Integer[] b){
        return a[1].compareTo(b[1]);
    }
}
