import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambdas {

    public static void main(String[] args) {

        ArrayList<Integer> array_list = new ArrayList<>();
        array_list.add(5);

        int primitive_integer = 1;
        // this works
        array_list.add(primitive_integer);
        array_list.add(6);
        array_list.add(13);
        array_list.add(69);
        array_list.add(75);
        array_list.add(36);

        System.out.println((array_list.get(1)).getClass());

        array_list.forEach( (n) -> {
            System.out.println(n);
        });



        // Streams
        // Source -> Filter -> Sort -> Map -> [Collect](terminal operation)
        // intermediate operations return another stream
        // anyMatch()    filter()    map()   sorted()
        // .forEach() applies the same FUNCTION to each element.
        // .collect() saves the elements into a collection
        // .reduce() turns stream into single summary element

        IntStream.range(1,10).forEach(x -> System.out.println(x));

        Stream.of("Abba", "Alberto", "Albertson's")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println); //

        Integer[][] myMatrix = { {1, 6}, {2, 5}, {3, 4} };

        Integer[][] collect1 = new Integer[3][2];
        List<Integer[]> collect2 = new ArrayList<>();


//        collect1 = Arrays.stream(myMatrix).sorted((c1, c2) -> c1[1].compareTo(c2[1])).toArray(Integer[][]::new);
//        collect1 = Arrays.stream(myMatrix).sorted().toArray(Integer[][]::new);
        collect2 = Arrays.stream(myMatrix).sorted((c1, c2) -> c1[1].compareTo(c2[1])).collect(Collectors.toList());

        System.out.println(collect2);

//      one parameter
//      (param) -> System.out.println("One parameter: " + param);

//        MyComparator myComparator = (a1, a2) -> return a1 > a2;

//        boolean result = myComparator.compare(2, 5);

//        String otherText = "hello: ";
//
//        MyInterface myInterface = text -> {
//            System.out.println(text);
//        };

    }
}

interface MyComparator {

    boolean compare(int a1, int a2);

}

interface MyInterface {
    void printIt(String text);
}