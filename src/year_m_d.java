public class year_m_d {
    public static void main(String[] args) {
        int n=500;
        int y =n/365; //1
        int m= n % 365 /30;
        int w = n % 365 % 30 / 7;
        int d = n % 365 % 30 % 7;

        System.out.println("years: "+y + " --Months: "+m + " --Weeks: "+w + " --Days: "+ " "+d);

    }
}
