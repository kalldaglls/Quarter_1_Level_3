import java.util.ArrayList;
import java.util.List;

public class ArraysMethods<T> implements Jenerik<T> {

    private List<T> items = new ArrayList<>();


    public ArraysMethods() {
    }

    public ArraysMethods(List<T> items) {
        this.items = items;
    }


    @Override
    public void changePlacement(int firstChange, int secondChange) {//Можно ли задать через List?
        T first = items.get(firstChange);
        T second = items.get(secondChange);
        items.set(firstChange,second);
        items.set(secondChange,first);
        System.out.println(items);
    }

    @Override
    public void arrayToList (T [] array) {
        List<T> newList = new ArrayList<>();
        for (T el: array) {
            newList.add(el);
        }
        System.out.println(newList);
        System.out.println(newList.getClass());

    }

}
