package String;

public class Compress_string {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        // a3b2c3d2
        System.out.println(compress(str));

    }
    public static String compress(String str){
        String s1 = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            s1 += str.charAt(i);

            if (count > 1){
                s1 += count.toString();
            }

        }
        return s1;
    }
}
