public class Encapsulation{

    // private String name;

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Banana");

        String name = person.getName();
        System.out.print(name);

        // Encapsulation e = new Encapsulation();
        // e.name = "Banana";
        // System.out.print(e.name);
        
    }
}

class Person{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}