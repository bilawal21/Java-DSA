import java.util.Collections;
import java.util.LinkedList;

public class LinkedL {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Merc");

        cars.set(2, "Mazda");
        cars.remove(1);
        // System.out.println(cars.get(1))
        cars.addFirst("Ferrari");
        cars.addLast("Honda");
        // cars.addAll(cars);
        // cars.removeAll(cars);
        // cars.clear();
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        
        Collections.sort(cars, Collections.reverseOrder());

        System.out.println(cars);

        // for (int i = 0; i < cars.size(); i++) {
        //     System.out.println(cars.get(i));
        // }
    }
}
