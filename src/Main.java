import DZ.first.Circle;
import DZ.first.First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle[][] circles = new Circle[5][5];
        for (int i = 0; i < circles.length; i++) {
            for (int j = 0; j < circles[i].length; j++) {
                circles[i][j] = new Circle(new Random().nextInt(800));
            }
        }
        for (int i = 0; i < circles.length; i++) {
            for (int j = 0; j < circles[i].length; j++) {
                System.out.println(circles[i][j]);
            }
        }
        First.findBiggerRadiusInTwoDimensionalArray(circles);
    }
}