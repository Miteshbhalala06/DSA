package collection_framework;
import java.util.Stack;

public class Adjcent_duplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stack = new Stack<>();
        String str = "";

        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            str += stack.pop();
        }
        System.out.println(str);

    }
}
