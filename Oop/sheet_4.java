//public class sheet_4 {
//    public static void main(String[] args) {
//        student s1 = new student(123,"mitesh",70,70,70,70,70);
//        student s2 = new student(123,"dakshit",600,60,60,60,60);
//        student s3 = new student(123,"chigi",500,50,50,50,50);
//        student s4 = new student(123,"vikas",40,40,40,40,40);
//        student s5 = new student(123,"CK",30,30,30,30,30);
//        student s6 = new student(123,"cax",20,20,20,20,20);
//
//        student[] Students = new student[6];
//        Students[0]=s1;
//        Students[1]=s2;
//        Students[2]=s3;
//        Students[3]=s4;
//        Students[4]=s5;
//        Students[5]=s6;
//
//        student.getTop3Student(Students);
//
//    }
//}
//
//class student {
//    private int rNo;
//    private String name;
//    private int mark1;
//    private int mark2;
//    private int mark3;
//    private int mark4;
//    private int mark5;
//    double perc;
//
//    public student(int rNo, String name, int mark1, int mark2, int mark3, int mark4, int mark5) {
//        this.rNo = rNo;
//        this.name = name;
//        this.mark1 = mark1;
//        this.mark2 = mark2;
//        this.mark3 = mark3;
//        this.mark4 = mark4;
//        this.mark5 = mark5;
//        int total = mark1 + mark2 + mark3 + mark4 + mark5 ;
//        perc = total / 5;
//    }
//
//    public static void getTop3Student(student[] Students){
//
//        //--------------------max method ------------------
////        double max1 = Integer.MIN_VALUE;
////        double max2 = Integer.MIN_VALUE;
////        double max3 = Integer.MIN_VALUE;
////
////        for (int i=0;i < Students.length;i++){
////            if (max1 < Students[i].perc){
////                max3=max2;
////                max2=max1;
////                max1 = Students[i].perc;
////            } else if (max2 < Students[i].perc && Students[i].perc != max1) {
////                max3 = max2;
////                max2 = Students[i].perc;
////            } else if (max3 < Students[i].perc && Students[i].perc != max2 && Students[i].perc != max1) {
////                max3=Students[i].perc;
////            }
////        }
//        //-------------------------------------------------------------------------------------------------
//        //-----------bubble sort method throw-----------------------------------------------------------
////        for (int i=0;i< Students.length-1;i++){
////            for (int j=0;j< Students.length-1-i;j++){
////                if (Students[j].perc > Students[j+1].perc){
////                    student temp = Students[j];
////                    Students[j] = Students[j+1];
////                    Students[j+1] = temp;
////
////                }
////            }
////        }
////
////        for (int i= Students.length-3; i< Students.length;i++){
////            System.out.println( Students[i].perc);
////        }
//        //------------------------------------------------------------------------------------------------
//        //---------------------Sir---------------------------------------------------------------------------
//
//        for (int i=0;i<2;i++){ // 3
//            for (int j=0;j<2;j++){
//                if (Students[j].perc < Students[j+1].perc){
//                    student temp = Students[j];
//                    Students[j] = Students[j+1];
//                    Students[j+1] = temp;
//                }
//            }
//        }
//
//        student max1 = Students[0];
//        student max2 = Students[1];
//        student max3 = Students[2];
////        System.out.println(max3.perc);
//
//        for (int i=3;i< Students.length;i++){
//            if (max1.perc < Students[i].perc){
//                max3 = max2;
//                max2 = max1;
//                max1 = Students[i];
//            } else if (max2.perc < Students[i].perc && Students[i].perc != max1.perc) {
//                max3 = max2;
//                max2 = Students[i];
//
//            } else if (max3.perc < Students[i].perc && Students[i].perc != max2.perc && Students[i].perc != max2.perc) {
//                max3 = Students[i];
//            }
//        }
//        System.out.println(max1.name + " "+ max1.perc);
//        System.out.println(max2.name + " "+ max2.perc);
//        System.out.println(max3.name + " "+ max3.perc);
//    //-----------------------------------------------------------------------
//
//    }
//}
//
