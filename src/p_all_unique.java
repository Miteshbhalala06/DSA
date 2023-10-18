public class p_all_unique {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40,20,60};
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            if (arr[i] == -1) {
                continue;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        flag = false;
                        arr[j] = -1;
                    }
                }
                if (flag == true) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
//public class p_all_unique {
//    public static void main(String[] args) {
//        int arr[] = {10, 20, 30,20, 40};
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = true;
//            for (int j = 0; j < arr.length; j++) {
//                if (i!=j && arr[i] == arr[j]) {
//                    flag = false;
//                }
//            }
//            if (flag == true) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//
//}