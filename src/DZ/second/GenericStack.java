package DZ.second;

import java.util.Arrays;

public class GenericStack<E>{
    private E[] array;
    private int size = 0;
    private final int initCapacity = 15;
    private int currentCapacity;
    public GenericStack(){
        array = (E[]) new Object[initCapacity];
        currentCapacity = initCapacity;
    }
    public int getSize(){
        return size;
    }
    public E peek(){
        if(size >0){
            return array[size - 1];
        }
        return null;
    }
    public E pop(){
        E element = peek();
        if(element != null){
            array[size - 1] = null;
            size--;
        }
        return element;
    }
    public void push(E o){
        if(size == currentCapacity){
            currentCapacity *=2;
            E[] newArray = (E[]) new Object[currentCapacity];
            System.arraycopy(array,0,newArray,0,size);
            array = newArray;
        }
        array[size] = o;
        size++;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        return "стек: " + Arrays.toString(array);
    }
}
