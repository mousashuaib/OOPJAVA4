public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 2);

        myDog.makeSound();
        myCat.makeSound();

        System.out.println(myDog.getName() + " is " + myDog.getAge() + " Zaid years old.");
        System.out.println(myCat.getName() + " is " + myCat.getAge() + " years old.");
    }
}
