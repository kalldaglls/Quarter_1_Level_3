import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer [] check1 = {1,2,3,5,6};
        String[] check2 = {"a","b","c"};
        Jenerik<Integer> checkList = new ArraysMethods<>();
        checkList.arrayToList(check1);

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.addToBox(new Apple(1));
        appleBox.addToBox(new Apple(1));
        appleBox.addToBox(new Apple(1));
        System.out.println(appleBox);
        appleBox.getWeight(1);
        System.out.println(appleBox.getWeight(1));
        Box<Apple> newAppleBox = new Box<>();
        newAppleBox.addToBox(new Apple(1));
        newAppleBox.addToBox(new Apple(1));
        System.out.println(appleBox.compare(newAppleBox,newAppleBox.getWeight(1)));



        /*
        ArrayList<String> arrayToChange = new ArrayList<>();//Упростило ли мне жизнь, что я задал не массив, а ArrList?
        arrayToChange.add("5");
        arrayToChange.add("4");
        arrayToChange.add("3");
        arrayToChange.add("2");
        arrayToChange.add("1");
        System.out.println(arrayToChange.toString());

        changePlacement(arrayToChange,2,0);

        Integer [] newArray = {12,34,56,78,910};
        arrayToList(newArray);
         */

    }
    /*
    public static void changePlacement(ArrayList<String> array, int firstChange, int secondChange) {//Можно ли задать через List?
        String first = array.get(firstChange);
        String second = array.get(secondChange);
        array.set(firstChange,second);
        array.set(secondChange,first);
        System.out.println(array);
    }

    public static void arrayToList (Integer [] array) {
        List<Integer> newList = new ArrayList<>();
        for (Integer el: array) {
            newList.add(el);
        }
        System.out.println(newList.getClass());

    }

     */
}
