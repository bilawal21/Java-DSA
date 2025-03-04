class Name {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String NewName) {
        this.name = NewName;
    }
}


public class Encapsulation {

    public static void main(String[] args) {
        Name obj = new Name();
        obj.setName("Bilawal");
        System.out.println(obj.getName());
    }
}