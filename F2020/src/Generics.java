import java.util.List;

public class Generics {

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);


    }


    // generic methods have <E>
    public static <E> void printArray(E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T> void wtv(){

        List<T> fooList;  // A list which will be of type T, when T is chosen.
        // Requires T was defined above in this scope
        List<?> barList;  // A list of some type, decided elsewhere. You can do
        // this anywhere, no T required.

    }

}
