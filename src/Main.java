import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Jessica");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");

        // before:
        System.out.println(names);

        // complete code below to traverse the arraylist and insert "HELLO" after any
        // name that contains the letter "i"
        for (int i = 0; i < names.size(); i++)
        {
            if (names.get(i).contains("i")) {
                names.add(i + 1, "HELLO");
                i++;
            }
        }

        // after:
        System.out.println(names);

        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Jessica");
        names2.add("Emily");
        names2.add("Destiny");
        names2.add("Mateo");
        names2.add("Sofia");
        names2.add("Tim");
        names2.add("James");

        // before:
        System.out.println(names2);

        // complete code below to traverse the arraylist and remove all
        // names that are exactly 5 letters long
        for (int i = 0; i < names2.size(); i++)
        {
            if (names2.get(i).length() == 5) {
                names2.remove(i);
                i--;
            }
        }

        // after:
        System.out.println(names2);

        int[] intList18 = {1, 2, 3, 2, 4, 5, 5, 6};
        ArrayList<Integer> modes = ArrayListAlgorithms.modes(intList18);
        System.out.println(modes);

        int[] intList19 = {1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 6};
        ArrayList<Integer> modes2 = ArrayListAlgorithms.modes(intList19);
        System.out.println(modes2);

        int[] intList20 = {1, 2, 1, 2, 4, 1, 2, 4, 1, 1, 3};
        ArrayList<Integer> modes3 = ArrayListAlgorithms.modes(intList20);
        System.out.println(modes3);

        int[] intList21 = {1, 2, 3, 4, 3, 2, 1, 4, 1, 2, 3};
        ArrayList<Integer> modes4 = ArrayListAlgorithms.modes(intList21);
        System.out.println(modes4);

        int[] intList22 = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes5 = ArrayListAlgorithms.modes(intList22);
        System.out.println(modes5);
















    }

}
