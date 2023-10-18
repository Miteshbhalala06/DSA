//public class sheet_2 {
//    public static void main(String[] args) {
//        Account a1 = new Account(123,"mitesh",5000);
//        Account.intrestrate = 4;
//        a1.calculateIntrest();
//        a1.DisplayAccountDetail();
//    }
//}
//
//class Account{
//    private int accNum;
//    private String cuName;
//    private int balance;
//    public static int intrestrate;
//
//   public Account(int accNum,String cuName,int balance){
//        this.accNum=accNum;
//        this.cuName=cuName;
//        this.balance=balance;
//    }
//
//    public void calculateIntrest(){
//        int intrest = (balance * intrestrate) / 100;
//        System.out.println(intrest);
//        balance = balance + intrest ;
//    }
//
//    public void DisplayAccountDetail(){
//        System.out.println(accNum+" "+cuName+" "+balance);
//    }
//
//}