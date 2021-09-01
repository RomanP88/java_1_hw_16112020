package java2_hw3;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        String[] words = {"apple", "lemon", "banana", "melon", "apple", "watermelon", "lemon", "pear", "banana"};
        System.out.println(Arrays.toString(words));
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0)+ 1);
        }
        System.out.println(map);


        Phone book = new Phone();
        book.add("Петров", 1254151522);
        book.add("Иванов", 265266216);
        book.add("Смирнов", 1098743561);
        book.add("Александров", 123450124);
        book.add("Сидоров", 987456122);
        book.add("Сидоров", 1020305040);
        book.add("Решетников", 1122334455);
        book.add("Алексеев", 1929394959);


        System.out.println("Номер телефона Петрова: " + book.get("Петров"));
        System.out.println("Номер телефона Иванова: " + book.get("Иванов"));
        System.out.println("Номер телефона Смирнова : " + book.get("Смирнов"));
        System.out.println("Номер телефона Александрова: " + book.get("Александров"));
        System.out.println("Номер телефона Сидорова: " + book.get("Сидоров"));
        System.out.println("Номер телефона Решетникова: " + book.get("Решетников"));
        System.out.println("Номер телефона Алексеева: " + book.get("Алексеев"));

    }
}
