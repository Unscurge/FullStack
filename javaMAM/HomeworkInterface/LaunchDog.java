
package HomeworkInterface;

public class LaunchDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }

}

class Dog implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog is Barking");
    }

}

interface Animal {
    void bark();
}