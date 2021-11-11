import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GitClass {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println("this is a change on IDEA");
    }
}
