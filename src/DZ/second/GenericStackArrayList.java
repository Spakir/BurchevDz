package DZ.second;

import java.util.ArrayList;


public class GenericStackArrayList<E> extends ArrayList<E> {
    public E pop() {
        if (!isEmpty()) {
            E element = get(size() - 1);
            remove(get(size() - 1));
            return element;
        }
        return null;
    }
}
