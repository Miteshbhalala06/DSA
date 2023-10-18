

public class insert_update_delete {
    /** Array Operations
     1. Insert
     2. Print
     3. Find
     4. Update
     5. Delete
     6. isEmpty
     7. size
     **/

    public static void main(String args[])
    {
        int array[]= new int[5];

        int p=0;
        System.out.println(isEmpty(p));

       p=insert(array,p,10);
       p = insert(array,p,20);
       p = insert(array,p,30);
        System.out.println(size(p));
       p = insert(array,p,40);
        System.out.println(isEmpty(p));
       p = insert(array,p,50);
        p = insert(array,p,60);

        print(array,p);
        find(array,p,60);
        update(array,p,20,2000);
        print(array,p);
        find(array,p,60);
        System.out.println(p);
       p= delete(array,p,40);
        System.out.println("after delete ");
        print(array, p);


        System.out.println(p);





    }
    public static int size(int p) {
        return p;
    }
    public static boolean isEmpty(int p) {
        if(p==0)
        {
            return true;
        }
        return false;

    }

    public static int delete(int array[],int p,int value) {
        for(int i=0;i<p;i++)
        {
            if(array[i]==value)
            {
                for (int j=i;j<p-1;j++)
                {
                    array[j]=array[j+1];
                }
                p--;
            }
        }
        return p;

    }


    public static void update(int array[],int p,int ovalue,int nvalue) {
        for(int i=0;i<p;i++)
        {
            if(array[i]==ovalue)
            {
                array[i]=nvalue;
                return;
            }
        }

    }

    public static void find(int array[],int p,int value) {
        for (int i=0;i<p;i++){
            if(array[i]==value)
            {
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Not Present");

    }


    public static void print(int array[],int p) {
        for (int i=0;i<p;i++)
        {
            System.out.print(array[i] + " ");
        }


    }

    public static int insert(int array[],int p,int value)
    {
        if(p== array.length)
        {
            System.out.println("Array is full");
            return p;
        }
        array[p]=value;
        p++;
        return p;
    }


}
