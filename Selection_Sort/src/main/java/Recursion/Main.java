package Recursion;
public class Main {
    public static void main(String[] args) {
        Recursion<Integer> SelectionRecursive = new Recursion<Integer>();

        SelectionRecursive.add(809);
        SelectionRecursive.add(100);
        SelectionRecursive.add(4413);
        SelectionRecursive.add(9);
        SelectionRecursive.add(69);
        SelectionRecursive.add(420);


        SelectionRecursive.Original_list();
        //no need to call SortRecursion because Sorted already calling SortRecursion( to prevent unnecessary printing line)
        //SelectionRecursive.SortRecursion(SelectionRecursive,0,SelectionRecursive.size()-1);

        SelectionRecursive.Sorted(SelectionRecursive);


    }

}

