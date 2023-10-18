//package Oops;
//
//public class Abstract {
//    public static void main(String[] args) {
//
//        // cannot create object of abstract class
////        Animal a1 = new Animal();       // error
//
////        Horse h = new Horse();
////        h.walk();
////        h.eat();
////        System.out.println(h.color);
////
////        Chicken c = new Chicken();
////        c.walk();
////        c.eat();
////        System.out.println(c.color);
//
//        Mustang m1 = new Mustang();
//
//
//    }
//}
//
//abstract class Animal{
//    String color;
////    Animal(){
////        color = "brown";
////    }
//
//    Animal(){
//
//        System.out.println("Animal constructor called");
//    }
//    void eat(){
//
//        System.out.println("animal eats");
//    }
//
//    abstract void walk();
//}
//
//class Horse extends Animal{
//
//    Horse(){
//
//        System.out.println("Horse constructor called");
//    }
//
//    void changeColor(){
//
//        color = "dark bown";
//    }
//    void walk(){
//        System.out.println("horse walks on 4 legs");
//    }
//}
//
//class Mustang extends Horse{
//    Mustang(){
//        System.out.println("Mustang constructor called");
//    }
//}
//
//class Chicken extends Animal{
//
//    void changeColor(){
//        color = "Yellow";
//    }
//    void walk(){
//        System.out.println("walks on 2 legs");
//    }
//}