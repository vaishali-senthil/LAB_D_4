//INHERITANCE
// fibanocci recursion check

public class Animals {
    public static void main(String[] args) {

    Cat cat = new Cat();
    cat.display();
    cat.print();

    }
}
class Animal{
    String type;

    void display(){
        type="domestic";
        System.out.println("i am "+type);
    }
}

class Cat extends Animal{
    String name;
    String color;

    void print(){
        name ="cat";
        color="white";
        System.out.println(name+color+type);
    }
}