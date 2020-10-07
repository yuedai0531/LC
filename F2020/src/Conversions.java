import java.util.Arrays;
import java.util.List;

public class Conversions {

    public static void main(String[] args) {

        // primitive integer to Integer.
        int primitive_integer = 2;
        System.out.println(primitive_integer);
        Integer obj = Integer.valueOf(primitive_integer);

        System.out.println(obj.getClass());

        // no need to do this
        Integer deprecated = Integer.valueOf(456);
        // use .valueOf() for this:
        Integer not_deprecated = Integer.valueOf("456");

        Integer y = new Integer(456);
        // unnecessary unboxing?
        int x = y.intValue();
        System.out.println(x);

//        CANNOT DO THIS
        int[] arr = { 1, 2, 3 };
//        List<Integer> list = Arrays.asList(arr); // this will get you List<int[]>

        Integer[] intArray = {1, 2, 3, 42}; // cannot use int[] here
        List<Integer> intList = Arrays.asList(intArray);
        System.out.println("intList: " + intList);

    }
}
