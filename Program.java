// 1. Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел. 
// Удалить из первого списка элементы отсутствующие во втором списке. 
// Отсортировать первый список методом sort класса Collections.

import java.util.ArrayList;
import java.util.Random;


public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++){
            list1.add(rnd.nextInt(100));
            list2.add(rnd.nextInt(100));
        }
        System.out.println(list1);
        System.out.println(list2);

    }
        
}
