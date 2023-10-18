import java.util.Arrays;

public class String_que_list_sir {
    public static void main(String[] args) {

        //        # reverse string  --------------------------------------------------------------------------

//        String s1 = "mitesh bhalala";
//        char arr[] = s1.toCharArray();
//        System.out.println(s1.length());
//
//        int left = 0 , right = arr.length-1;
//
//        while (left < right){
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        s1 = new String(arr);
//        System.out.println(s1);

        //        # string is palindrome or not -------------------------------------------------------------------------

//        String s1 = "mitrsknk";
//
//        int left = 0 , right = s1.length()-1;
//
//        while (left < right){
//            if (s1.charAt(left) != s1.charAt(right)){
//                System.out.println("String are not equal");
//                return;
//            }
//            left++;
//            right--;
//        }
//        System.out.println("String are  equal");

        //        # count number of words in a String -----------------------------------------------------------------

//        String s1 = "  add zero  group  ";
//        s1 = s1.trim();
//        int count = 0;
//
//        for (int i = 0; i < s1.length(); i++) {
//
//            if (s1.charAt(i) == ' ' && s1.charAt(i-1) != ' '){
//                count++;
//            }
//
//        }
//        System.out.println(count+1);

        //        # find duplicate chars from string - Time O(n2), Space O(n) -------------------------------------------------------

//        String s1 = "mit  eesh  bhala   la";
//        s1 = s1.trim();
//        char arr[] = s1.toCharArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] == ' '){
//                    continue;
//                }
//                else if (arr[i] == arr[j]){
//                    System.out.print(arr[i]+" ");
//                    arr[i] = ' ';
//                }
//            }
//        }

        //        # Using ASCII - Time O(n), Space O(n)-------------------------------------------------------------------

//        String s1 = "mit  eesh  bhala   la";
//        int arr[] = new int[128];
//
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i)==' '){
//                continue;
//            }
//            int ascii = (int) s1.charAt(i);
//            arr[ascii]++;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 1){
//                System.out.print((char) i + " ");
//            }
//        }

        //        # Program to check if two strings are same or not (without using inbuilt function .equals)-------------------------------------

//        String s1 = "mitesh 1";
//        String s2 = "mitesh 1 ";
//
//        if (s1.length() != s2.length()){
//            System.out.println("string are not equal");
//            return;
//        }
//
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) != s2.charAt(i)){
//                System.out.println("string are not equal");
//                return;
//            }
//        }
//        System.out.println("string are equal");

        //        # Update a character in a string (without using .replace() function)---------------------------------------------

//        String s1 = "mitesh";
//        char arr[] = s1.toCharArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]=='m'){
//                arr[i]='h';
//            }
//        }
//
//        s1 = new String(arr);
//        System.out.println(s1);

        //        # Sort string of characters ---------------------------------------------------------------------------


//        String s1 = "mitesh abc";
//        char arr[] = s1.toCharArray();
//
//        for (int i = 0; i < s1.length()-1; i++) {
//            for (int j = 0; j < s1.length()-1-i; j++) {
//                if (arr[j] > arr[j+1]){
//                    char temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
//        }
//        s1 = new String(arr);
//        System.out.println(arr);

        //        # Print frequency of all the characters in string---------------------------------------------------------------------------

//        String s1 = " mitrdh bhalala";
//        char arr[] = s1.toCharArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j]==' '){
//                    continue;
//                }
//                if (arr[i] == arr[j]){
//                    count++;
//                    arr[j] = ' ';
//                }
//            }
//                System.out.println(arr[i] +" "+count);
//        }


        //        # Using ASCII

//        String s1 = " mitrdh bhalala";
//        int arr[] = new int[128];
//
//        for (int i = 0; i < s1.length(); i++) {
//            int ascii = (int) s1.charAt(i);
//            arr[ascii]++;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0){
//                System.out.println((char) i + " " + arr[i]);
//            }
//
//        }

        //        # Remove Vowels from a String------------------------------------------------------------------------------

//        String s1 = "mitesh bhalala";
//        String str = "";
//
//        for (int i = 0; i < s1.length(); i++) {
//            char c = s1.charAt(i);
//            if (c == 'A' || c == 'E' ||c == 'I' ||c == 'O' ||c == 'U' ||
//            c == 'a' ||c == 'i' ||c == 'o' ||c == 'e' ||c == 'u' ){
//                continue;
//            }else {
//                str += c;
//            }
//        }
//        System.out.println(str);

        //       # Reverse Words in a String--------------------------------------------------------------------------

//        String s1 = " hello mitesh bhalala";
//        String str = "";
//        String arr[] = s1.split(" ");
//
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            str += arr[i] + " ";
//        }
//        System.out.println(str);

        // all words are reverse through reverse function method --------------

//        String s1 = "hello mitesh bhalala";
//        String str = "";
//        String arr[] = s1.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            str = str + reverse(arr[i]) + " ";
//
//        }
//
//        System.out.println(str);


        //        # remove All Digits--------------------------------------------------------------------------------------

//        String s1 = "4mite1sh23";
//        String str = "";
//
//        for (int i = 0; i < s1.length(); i++) {
//            if(!Character.isDigit(s1.charAt(i))){
//                str += s1.charAt(i);
//            }
//        }
//        System.out.println(str);

        // without use any method of digits

//        String s1 = "4mite1sh23";
//
//        int asciiZero = (int) '0';
//        int asciiNine = (int) '9';
//        String str = "";
//
//        for (int i = 0; i < s1.length(); i++) {
//            int ascii = (int) s1.charAt(i);
//            if (asciiZero <= ascii && asciiNine >= ascii){
//                continue;
//            }
//            str += s1.charAt(i);
//        }
//        System.out.println(str);

        //        # Merge Strings Alternatively----------------------------------------------------------------

//        String s1 = "hello0";
//        String s2 = "java";
//        String str = "";
//
//        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
//            if (i<s1.length()){
//                str += s1.charAt(i);
//            }
//            if (i<s2.length()){
//                str+= s2.charAt(i);
//            }
//        }
//
//        System.out.println(str);


        //        # Check if string have equal digits and chars-------------------------------------------------------

//        String s1 = "4mite1sh223";
//        int digit_count = 0;
//        int char_count = 0;
//
//        for (int i = 0; i < s1.length(); i++) {
//            if (Character.isDigit(s1.charAt(i))){
//                digit_count++;
//                break;
//            }
//            char_count++;
//        }
//
//        if(char_count == digit_count){
//            System.out.println("have");
//        }
//        System.out.println("not have");

        // without use any method of string

//        String s1 = "4mite1sh223";
//        int asciiZero = (int) '0';
//        int asciiNine = (int) '9';
//        int digit_count = 0;
//        int char_count = 0;
//
//        for (int i = 0; i < s1.length(); i++) {
//            int ascii = s1.charAt(i);
//
//            if(s1.charAt(i) == ' '){
//                continue;
//            }
//
//            if (asciiZero <= ascii && ascii >= asciiNine){
//                digit_count++;
//            }
//            else
//            char_count++;
//        }
//        System.out.println(digit_count == char_count ? "equal" : "not equal");


        //        # Remove duplicate chars from string----------------------------------------------------------------

        String s1 = "hello mitesh bhalala";
        char arr[] = s1.toCharArray();
        String s2= "";

        for(int i=0; i<arr.length; i++){
            int j;
            for(j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(j==i){
                s2 += arr[i];
            }
        }
        System.out.println(s2);

        //        # Using ascii

//        String s1 = "hello mitesh bhalala";
//        int arr[] =  new int[128];
//        String str =  "";
//
//        for (int i = 0; i < s1.length(); i++) {
//            int ascii = (int) s1.charAt(i);
//            arr[ascii]++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==1){
//                str += (char) i;
//            }
//        }
//        System.out.println(str);
//    }

//    private static String reverse (String str){
//        char arr [] = str.toCharArray();
//        int left = 0 , right = arr.length-1;
//
//        while (left < right){
//            char temp = arr[left];
//            arr[left ] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        str = new String(arr);
//        return str;
//    }
    }


}
