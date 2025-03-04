import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Merc");
        cars.add("Ferrari");
        cars.add("Ford");
        cars.add(1, "Mazda");
        System.out.println(cars.get(3));
        cars.set(2, "Mercedes");
        cars.remove(1);
        // cars.clear();
        System.out.println(cars.size());
        Collections.sort(cars);
        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
