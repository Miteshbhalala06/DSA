public class prectice_new {
    public static void main(String[] args) {
        int arr[] = {3,2,3,4,2};

        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
//                    System.out.println(arr[i]);
                    count++;

                }

            }

        }
        System.out.println(count);

    }
}
