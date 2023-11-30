package Recursion;

import java.util.LinkedList;

 class  Recursion<E>{

    private final LinkedList <E> SelectionList = new LinkedList<>();

    public void add(E item){
        SelectionList.add(item);

    }
    //return as integer so that it can be j value(size-1)
    public int size(){
        return  SelectionList.size();
    }
    public int get(int index){
        return (int) SelectionList.get(index);
    }
    public void set(int index, E item){
        SelectionList.set(index, item);
    }


    public void Original_list(){
        System.out.println("original sort:");
        for(E sorted: SelectionList)
        {
            System.out.print(sorted+ " ");
        }
        System.out.println(" ");


        for(int i = 0 ; i < 10 ; i++)
            System.out.print("---");

        System.out.println(" ");

    }

    public static void SortRecursion (Recursion<Integer> SelectionList, int i, int j ){
        if(i<j){
            int min_index = i;
            int max_index = i;
            int min = SelectionList.get(i);
            int max = SelectionList.get(i);

            for (int k = i; k <= j; k++)
            {
                if (SelectionList.get(k) > max)
                {
                    max_index = k;
                    max = SelectionList.get(k);
                } else if (SelectionList.get(k) < min)
                {
                    min_index = k;
                    min = SelectionList.get(k);
                }
            }
            swap(SelectionList,i,min_index);
            if(SelectionList.get(min_index)== max)
            {
                swap(SelectionList,j,min_index);
            }
            else
                swap(SelectionList,j,max_index);
            display(SelectionList);

            SortRecursion(SelectionList, i + 1, j - 1);
        }


    }
    static void swap(Recursion<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, temp);
    }
    static void display(Recursion<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    static void Sorted(Recursion<Integer> SelectionList){
        SortRecursion(SelectionList,0,SelectionList.size()-1);

        for(int i = 0 ; i < 10 ; i++)
            System.out.print("---");

        System.out.println(" ");
        System.out.println("Sorted:");

        for (int i = 0; i < SelectionList.size(); i++) {
            System.out.print(SelectionList.get(i) + " ");
        }
        System.out.println();


    }
}

