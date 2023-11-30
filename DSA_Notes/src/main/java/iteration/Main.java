package iteration;

public class Main {
    public static void main(String[] args) {

        //implenting List class
        Iteration<Integer> linked = new Iteration<Integer>();

        //calling add method from the list class
        linked.add(1132);
        linked.add(89);
        linked.add(9090);
        linked.add(2);
        linked.add(12);

        //calling origanal method/function
        linked.original();

        //calling sorting method
        linked.sorting();
    }
}