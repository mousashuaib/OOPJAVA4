public class Dog extends Animal {
    //this calss doggi
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
