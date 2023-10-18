public class min_ele_stack {
    static int Maintop = -1;

    public static void main(String[] args) {

         int [] MainStack = new int[10];
         int [] MinimumStack = new int[10];
         int MinimumTop = -1;

        MinimumTop =   push(MainStack,MinimumStack,MinimumTop,10);
        MinimumTop = push(MainStack,MinimumStack,MinimumTop,5);
        MinimumTop = push(MainStack,MinimumStack,MinimumTop,15);
        MinimumTop = push(MainStack,MinimumStack,MinimumTop,12);
        MinimumTop = push(MainStack,MinimumStack,MinimumTop,1);
        MinimumTop = popToStack(MainStack,MinimumStack,MinimumTop);
        System.out.println(getMin(MinimumStack,MinimumTop));


    }
    public static int getMin(int[] MinimumStack , int MinimumTop){
        return MinimumStack[MinimumTop];
    }
    public static int  popToStack(int[] MainStack,int[] MinimumStack,int MinimumTop){
        int mainpeek = MainStack[Maintop];
        Maintop--;
        if (mainpeek == MinimumStack[MinimumTop]){
            MinimumTop--;
        }
        return MinimumTop;
    }
    public static int push(int[] Mainstack,int[] MMinimumStack,int MinimumTop,int value){
        Maintop++;
        Mainstack[Maintop] = value;
        if (isEmpty(MinimumTop)){
            MinimumTop++;
            MMinimumStack[MinimumTop] = value;
        }else if (value < MMinimumStack[MinimumTop]){
            MinimumTop++;
            MMinimumStack[MinimumTop] = value;
        }
        return MinimumTop;
    }
    public static boolean isEmpty(int MinimumTop){
        if (MinimumTop == -1){
            return true;
        }
        return false;
    }



}
