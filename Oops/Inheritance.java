public class Inheritance {
    public static void main(String[] args) {

        Animal shark = new Animal();
        shark.eat();

    }
}

class  Animal{
    String color;
    void eat(){

        System.out.printf("eats");
    }

    void breathe(){

        System.out.println("breathe");
    }
}

class Fish extends Animal{

    int fins;

}
