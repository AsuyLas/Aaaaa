import java.util.ArrayList;
import java.util.HashMap;

public class BookListToHashMap {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("The Catcher in the Rye");
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("Pride and Prejudice");
        books.add("The Great Gatsby");

        HashMap<Integer, String> bookMap = convertToHashMap(books);

        System.out.println("HashMap based on the book list: ");
        for (Integer key : bookMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + bookMap.get(key));
        }
    }

    public static HashMap<Integer, String> convertToHashMap(ArrayList<String> bookList) {
        HashMap<Integer, String> bookMap = new HashMap<>();

        for (int i = 0; i < bookList.size(); i++) {
            bookMap.put(i, bookList.get(i));
        }

        return bookMap;
    }
}
