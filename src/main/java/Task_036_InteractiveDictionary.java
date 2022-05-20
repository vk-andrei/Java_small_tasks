import java.util.HashMap;

public class Task_036_InteractiveDictionary {
    public static void main(String[] args) {

        Dictionary dictionary1 = new Dictionary();
        dictionary1.newEntry("Apple", "grows on a tree");
        dictionary1.newEntry("Potato", "grows under the ground");
        dictionary1.newEntry("Car", "What the fuck?");

        System.out.println(dictionary1.look("Potato"));
        System.out.println(dictionary1.look("Pot"));
        System.out.println(dictionary1.look("Car"));

    }

    public static class Dictionary {
        private final HashMap<String, String> myMap;

        public Dictionary() {
            myMap = new HashMap<>();
        }

        public void newEntry(String key, String value) {
            myMap.put(key, value);
        }

        public String look(String key) {
            return myMap.getOrDefault(key, "Can't find entry for " + key);
        }
    }
}