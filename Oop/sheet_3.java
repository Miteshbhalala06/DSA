//public class sheet_3 {
//    public static void main(String[] args) {
//        Account a1 = new Account();
//        a1.setAccountDetail(123,"poran",0);
//        a1.deposit(20000);
//        a1.withDraw(22000);
//        a1.displayAccountDetail();
//
//    }
//}
//
//class Account{
//    private int acNum;
//    private String name;
//    private int balance;
//
//
//    public void setAccountDetail(int acNum,String name,int balance){
//        this.acNum=acNum;
//        this.name=name;
//        this.balance=balance;
//    }
//
//    public void deposit(int add){
//        balance = balance + add;
//    }
//
//    public void withDraw(int substract){
//        if (balance > substract){
//            balance = balance - substract;
//        }else {
//            System.out.println("insufficient balance" );
//            return;
//        }
//
//    }
//
//    public void displayAccountDetail(){
//        System.out.println(acNum+" "+name+" "+balance);
//    }
//}
//
