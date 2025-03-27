import java.util.ArrayList;

public class Union {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                if (Union.isEmpty() || Union.get(Union.size()-1) != a[i]){
                    Union.add(a[i]);
                }
                i++;
            }
            else {
                if (Union.isEmpty() || Union.get(Union.size()-1) != b[j]){
                    Union.add(b[j]);
                }
                j++;
            }
        }
        while (i < a.length){
            if (Union.get(Union.size()-1) != a[i]){
                Union.add(a[i]);
            }
            i++;
        }
        while (j < b.length){
            if (Union.get(Union.size()-1) != b[j]){
                Union.add(b[j]);
            }
            j++;
        }

        return Union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        ArrayList<Integer> U = findUnion(arr1,arr2);
        for (int val: U) {
            System.out.print(val+" ");
        }
//        for (int i = 0; i < U.size(); i++) {
//            System.out.println(U.get(i));
//        }

    }
}
