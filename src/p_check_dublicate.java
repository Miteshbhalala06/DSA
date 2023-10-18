
                    //Check if given number is duplicate or not

public class p_check_dublicate {
    public static void main(String[] args) {
        int array[]={10,20,30,20,40};
        int num=20;
        int count=0;

        for(int i=0;i< array.length;i++){
            if(array[i]==num)
            {
                count++;
            }
        }



//        if(count > 1) for number is dublicate or not
        if(count < 1)

        {
            System.out.println("number is unique");
        }else{
            System.out.println("number is not unique");
        }


    }
}
