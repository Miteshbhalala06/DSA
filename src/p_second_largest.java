public class p_second_largest {
    public static void main(String[] args) {
        int array[]={10,20,70,100,100,90, 40, 80};
        int max1=0;
        int max2=0;
        int max3=0;


        for (int i=0;i< array.length;i++){
            if (array[i] > max1){
                max3=max2; //20
                max2=max1; //50
                max1=array[i]; //60
            }
            else if (array[i]>max2 && array[i]!=max1){
                max3=max2; //20
                max2=array[i];
            }
            else if (array[i]>max3 && array[i]!=max1  && array[i]!=max2){
                max3=array[i];
            }

        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}
