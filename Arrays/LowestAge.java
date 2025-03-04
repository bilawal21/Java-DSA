public class LowestAge {

    static int lowestAge(int[] ages){
        int lowest_age = ages[0];

        for (int age : ages) {
            if (lowest_age > age) {
                lowest_age = age;
            }
        }
        return lowest_age;
    }

    public static void main(String[] args) {
        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
        // LowestAge obj = new LowestAge();
        // System.out.println(obj.lowestAge(ages));
        System.out.println(lowestAge(ages));
        
        // int lowestAge = ages[0];

        // for (int age : ages) {
        //     if (lowestAge > age) {
        //         lowestAge = age;
        //     }
        // }
        // System.out.println(lowestAge);
    }
    
    
}