public class Calculate {
    public static int calculateSum(int num1, int num2) {
        // arguments "passed by value" in this function
        num1 = 4; // changes only this local copy not the original variables values in main
        num2 = 5;
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 2; // remains the same
        int n2 = 3; // remains the same
        int result = calculateSum(n1, n2);
        System.out.println(result);
        System.out.println(n1 + " " + n2);
    }
}


// class Person{
// 	String name;
// }

// public class Main {
//     // This function changes the name inside the Person object.
//     public static void modifyName(Person p) {
//         p.name = "Alice";  // Changes the object itself
//     }

//     // This function reassigns the reference p to a new Person.
//     public static void reassignPerson(Person p) {
//         p = new Person();  // This only changes the local copy of the reference
//         p.name = "Bob";
//         System.out.println(p.name);
//     }

//     public static void main(String[] args) {
//         Person person = new Person();
//         person.name = "John";
        
//         // Passing the object to modifyName.
//         modifyName(person);
//         System.out.println("After modifyName: " + person.name); // Output: Alice
        
//         // Passing the object to reassignPerson.
//         reassignPerson(person);
//         System.out.println("After reassignPerson: " + person.name); // Output still: Alice
//     }
// }
