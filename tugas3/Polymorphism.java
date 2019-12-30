public class Polymorphism{
    public static void main(String[] args) {

        //Polymorphism Dynamic
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Cat();
        animals[2] = new Dog();
        for(Animal animal: animals){
            animal.sound();
        }

        //Polymorphism Static
        Human human = new Human();
        human.printAge(20);
        human.printAge("Twenty");

        human.printName("Banana");
        human.printName("Blue", "Banana");
    }
}

// POLYMORPHISM DYNAMIC OR METHOD OVERRIDDING
class Animal{
    
    protected void sound(){
        System.out.println("Animal Sound");
    }

}

class Cat extends Animal{
    
    @Override
    protected void sound(){
        System.out.println("meow.. meow...");
    }

}

class Dog extends Animal{

    @Override
    protected void sound(){
        System.out.println("guk.. guk...");
    }

}

// POLYMORPHISM STATIC OR METHOD OVERLOADING

class Human{

    public void printAge(int age){
        System.out.println(age);
    }

    public void printAge(String age){
        System.out.println(age);
    }

    public void printName(String first){
        System.out.println(first);
    }

    public void printName(String first, String last){
        System.out.println(first + " " + last);
    }

}
