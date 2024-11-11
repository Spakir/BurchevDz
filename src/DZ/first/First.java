package DZ.first;

import java.util.*;

public class First {
    public static  <T>List<T> getUniqueList(List<T> list){
        List<T> uniqueList = new ArrayList<>();
        for(T elem : list){
            if(!uniqueList.contains(elem)){
                uniqueList.add(elem);
            }
        }
        return uniqueList;
    }
    public static  <T>  int linearSearch(List<T> list,T desiredElement){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(desiredElement)){
                return i;
            }
        }
        return -1;
    }

    public static void findBiggestRadius(List<Circle> list){
        Collections.sort(list);
        Circle biggestRadius = list.get(0);
        System.out.println("Biggest radius is: " + biggestRadius.getRadius());
    }
    public static void findBiggerRadiusInTwoDimensionalArray(Circle[][] circles) {
        Circle biggestCircle = circles[0][0];
        for (int i = 0; i < circles.length; i++) {
            for (int j = 0; j < circles[i].length; j++) {
                if (biggestCircle.compareTo(circles[i][j]) > 0) {
                    biggestCircle = circles[i][j];
                }
            }
        }
        System.out.println("Biggest radius is: " + biggestCircle.getRadius());
    }
}
