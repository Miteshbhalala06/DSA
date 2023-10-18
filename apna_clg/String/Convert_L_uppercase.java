package String;

public class Convert_L_uppercase {
    public static void main(String[] args) {
        String str = "hi,  i am mitesh ";
        System.out.println(toUpperCase(str));

    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i) == ' '  && i < str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}

