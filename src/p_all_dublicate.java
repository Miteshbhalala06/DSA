
                                        //Print all dublicate numbers

public class p_all_dublicate {
    public static void main(String[] args) {
        int [] array = { 1,2,3,4,5,2,4,4,4,4,4};

        for(int i=0;i< array.length;i++)
        {
            for(int j= i+1;j< array.length;j++)
            {
                if(array[i]==array[j] && array[i]!=-1)
                {
                    System.out.print(array[i] + " ");
                    for(int k=j+1;k< array.length;k++)
                    {
                        if(array[k]==array[i])
                        {
                            array[k]=-1;
                        }
                    }
                }
            }
        }

    }
}

//public class p_all_dublicate {
//    public static void main(String[] args) {
//
//        //Initialize array
//        int [] arr = new int [] {1, 2, 3, 4, 5,2,4,4,4,4};
//
//        System.out.println("Duplicate elements in given array: ");
//        //Searches for duplicate element
//        for(int i = 0; i < arr.length; i++) {
                                        // with i+1
//            for(int j = 0; j < arr.length; j++) {
//                if( i!=j && arr[i] == arr[j])
//                    System.ou t.print(arr[i] + " ");
//            }
//        }
//
//    }
//}