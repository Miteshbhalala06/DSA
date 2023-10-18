import java.util.Arrays;

public class sheet_7 {
    public static void main(String[] args) {

        int[] marks1 = {80,82,84,88,86};

        Student s1 = new Student();
        s1.input("mitesh",marks1);
        s1.show();
        Student.totalStudent();
        System.out.println(s1.totalMarks(marks1));

    }
}


class Student{
   private static int u_num;
    private int roll;
    private String name;
    private int total=0;

    private int [] arr = new int[5];

    Student(){
        this.roll = u_num++;
    }

    public void input(String name , int[] mark1){
        this.name = name;
        arr = mark1;
    }

    public void show(){
        System.out.println(name + " " + roll + " " + Arrays.toString(arr));
    }
    public static void totalStudent(){
        System.out.println(u_num);
    }
    public int totalMarks(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public getHighest


}
