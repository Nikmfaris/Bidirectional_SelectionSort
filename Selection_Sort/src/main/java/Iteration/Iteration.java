package Iteration;

import java.util.LinkedList;


//creating list class
class Iteration<E> {
    private final LinkedList<E> list = new LinkedList<>();
    public void add(E item) {
        // to add
        list.add(item);
    }

    //original method
    public void original() {
        System.out.print("original == ");

        //printing list (linked list)
        for (E sorted : list) {
            System.out.print(sorted+ "  ");
        }
        System.out.println(" ");
        System.out.println("**********************************");

    }

    public void sort() {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {

            int min = (int) list.get(i);
            int max = (int) list.get(i);
            int min_i = i;
            int max_i = i;

            for (int k = i; k <= j; k++) {
                if ((int) list.get(k) > max) {
                    max = (int) list.get(k);
                    max_i = k;
                } else if ((int) list.get(k) < min) {
                    min = (int) list.get(k);
                    min_i = k;
                }
            }

            //display method is implemented to show the swapping movement
            swap(list, i, min_i);

            // -- for more detail,enable this
            //display(); max and min swapping will be shown separately

            if ((int) list.get(min_i) == max) {
                swap(list, j, min_i);
                display();
            } else {
                swap(list, j, max_i);
                display();
            }
        }
    }

    public static void swap(LinkedList  list, int i, int j) {

        //creating temporary space before swapping between 2 indexes
        int temp = (int) list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public void display() {
        for (E sort : list) {
            System.out.print(sort+ "  ");
        }
        System.out.println(" ");

    }

    //sorting method
    public void sorting(){
        System.out.println("movement of the Linked list");

        //calling sort method
        sort();

        for(int i =0;i<34;i++){
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print("sorted == ");

        //print the sorted list
        for(E sorted: list)
        {
            System.out.print(sorted+ " ");
        }

    }
}
