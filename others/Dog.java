package others;

public class Dog {
    String name;
    int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }

    public  void bark(){
        System.out.println(name + " says: Woof!");
    }

    public  static void main(String[] args){
        Dog myDog = new Dog("Buddy", 3);
        myDog.bark();
    }
}
