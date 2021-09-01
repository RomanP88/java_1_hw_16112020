package java2_hw3;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Phone {
    private TreeMap<String, Set<Integer>> phoneBook = new TreeMap<>();



    public void add(String name, Integer number) {
        Set<Integer> phone = phoneBook.getOrDefault(name, new TreeSet<>());
        phone.add(number);
        phoneBook.put(name, phone);
    }

    public Set<Integer> get(String name){
        return phoneBook.get(name);
    }
}
