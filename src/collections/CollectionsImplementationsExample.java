package collections;

import java.util.*;

public class CollectionsImplementationsExample {
    public static void main(String[] args) {
        // ArrayList (List implementation)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList (List and Queue implementation)
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.addFirst("Grapes"); // Specific to LinkedList
        System.out.println("LinkedList: " + linkedList);

        // HashSet (Set implementation)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet (Set implementation, maintains insertion order)
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet (Set implementation, sorted order)
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        System.out.println("TreeSet: " + treeSet);

        // HashMap (Map implementation)
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 2);
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap (Map implementation, maintains insertion order)
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 3);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Orange", 2);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap (Map implementation, sorted order)
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 5);
        treeMap.put("Apple", 3);
        treeMap.put("Orange", 2);
        System.out.println("TreeMap: " + treeMap);
    }
}