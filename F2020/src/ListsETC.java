import java.util.*;
import java.util.stream.Collectors;

public class ListsETC {

//    ArrayList<THIS_IS_IMPORTANT> al = new ArrayList<>();

    public static void main(String[] args) {

        Arrays.equals(new int[] {1,1}, new int[] {1,1});

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,6,4,5));
        System.out.println(al);

        int[] arr = {6,3,4,5};
        System.out.println(Arrays.asList(arr).getClass());
        List<Integer> arrToList = Arrays.stream(arr).boxed().collect(Collectors.toList());


        for (int i = 1; i < al.size(); i++){
            if (!(al.get(i-1).intValue() <= al.get(i).intValue())) {
                System.out.println("false");;
            }
        }
        System.out.println("true");

        Queue qA = new LinkedList();

        Queue minHeap = new PriorityQueue();

        Queue maxHeap = new PriorityQueue(new SortDescending());

        Queue maxHeap1 = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b){
                return b.compareTo(a);
            }
        });

        PriorityQueue<Integer> pq =new PriorityQueue<>((x, y) -> Integer.compare(y, x));

        PriorityQueue<Integer> maxHeap2 = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        Queue heap2 = new PriorityQueue<>(Arrays.asList(6,3,4,5));

        Queue<Integer> maxPQ = new PriorityQueue<>((a,b) -> b.compareTo(a));



        for (int i = 0; i < 8; i++){
            maxHeap.add(i * 2);
        }

        System.out.println("heap2 peek: " + heap2.peek());
        System.out.println("maxHeap peek: " + maxHeap.peek());
    }
}

class SortDescending implements Comparator<Integer>
{
    @Override
    public int compare(Integer a, Integer b){
        return b.compareTo(a);
    }
}