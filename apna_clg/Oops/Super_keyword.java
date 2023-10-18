package Oops;

public class Super_keyword {
    public static void main(String[] args) {

        Horse h1 = new Horse();
        System.out.println(h1.color);


    }
}

class Animal{
    String color;

    Animal(){
        System.out.println("Animal consrtuctor is called..");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color="brown";
        System.out.println("Horse constructor is called");
    }
}
