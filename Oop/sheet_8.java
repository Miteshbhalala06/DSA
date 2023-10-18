//public class sheet_8 {
//    public static void main(String[] args) {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.gearChange(2);
//
//        Bike bike = new Bike();
//        bicycle.gearChange(6);
//
//
//
//
//
//    }
//}
//interface vehicles {
//    public  void gearChange(int gear);
//}
//
//class Bicycle implements vehicles{
//    private int gear ;
//    private final int maxgear = 2;
//
//    @Override
//    public void gearChange(int gear) {
//
//        if (gear > 0 && gear <= maxgear){
//            this.gear = gear;
//            System.out.println("Bicycle gear change to " + gear);
//        }else
//            System.out.println("Invalid gear");
//
//    }
//}
//class Bike implements vehicles{
//    private int gear;
//    private final int maxgear = 5;
//
//    @Override
//    public void gearChange(int gear) {
//
//        if (gear > 0 && gear <= maxgear){
//            this.gear = gear;
//            System.out.println("Bike gear change to " + gear);
//        }else {
//            System.out.println("Invalid gear");
//        }
//    }
//}
