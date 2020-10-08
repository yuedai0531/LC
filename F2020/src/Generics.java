import java.util.HashMap;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        Digit<Integer> intObject = new Digit<>(7, 2);
        intObject.showType();
        intObject.add();
        Digit<Double> doubleObject = new Digit<>(5.6, 1.0);
        doubleObject.showType();
        doubleObject.add();
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

class Digit<T extends Number> {
    T obj1;
    T obj2;

    Digit(T obj1, T obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void showType(){
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
    }

    void add(){
        // intValue() possible since extend Number
        System.out.println(
                "" + obj1.intValue() + " + " + obj2.doubleValue()
                + " = " + (obj1.intValue() + obj2.doubleValue())
        );
    }
}

class Dict<K, V> {
    HashMap<K, V> db = new HashMap<>();

    Dict(K obj1, V obj2) {
        db.put(obj1, obj2);
    }
}
