import java.util.LinkedHashMap;
import java.util.Map;
public class PhoneBook {
    private static final int MAX_ENTRIES = 5;

    public static void main(String[] args) {

        LinkedHashMap<String, String> my_book = new LinkedHashMap(4, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size() > MAX_ENTRIES;
            }
        };

        my_book.put("China Mobile", "10086");
        my_book.put("Police", "110");
        my_book.put("Fireman", "119");
        my_book.put("Ambulance", "120");
        my_book.get("China Mobile");
        my_book.put("Train", "12306");
        my_book.put("Government", "12345");
        System.out.println(my_book);
    }
}
