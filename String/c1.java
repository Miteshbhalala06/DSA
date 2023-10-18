
public class c1 {
    public static void main(String[] args) {

        String s = "Hello how are you Contestant";
        int k=4;

        String str = "";
        int space_c = 1;

        for(int i=0;i<s.length();i++){

            if(space_c == k){
                break;
            }
             if(s.charAt(i) == ' ' && space_c < k){
                str += s.charAt(i);
                space_c++;
            }else {
                str += s.charAt(i);
            }
        }
        System.out.println(str);


    }

}
