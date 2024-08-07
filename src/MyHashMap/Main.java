package MyHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap map= new MyHashMap();
        map.put(1, "hitesh");
        map. put (2, "John");
        map. put (6, "Jane");
        map.put(5, "ABC");
        map.put(7, "XYZ");
        map.put(7, "Hitesh1");
        map.remove(1);
        System.out.println(map);
    }
}
