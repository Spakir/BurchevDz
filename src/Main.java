import DZ.first.Circle;
import DZ.first.First;
import DZ.second.GenericStack;
import DZ.second.GenericStackArrayList;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        testGenericStackArrayList();
    }

    public static void testGenericStackArrayList(){
        GenericStackArrayList<String> list = new GenericStackArrayList<>();
        for (int i = 1; i <=5; i++) {
            System.out.println(String.format("введите строку №%d",i));
            String string = scanner.nextLine();
            list.add(string);
        }
        System.out.println("Вывод в обратном порядке:");
        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}