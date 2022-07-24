package Com.BridgeLabz.HashTable2;

public class HashTable2 {
    public static void main(String[] args) {
        HashTableImplementation2<String, Integer> hashImpl = new HashTableImplementation2<String, Integer>();

        HashTableImplementation2<String, Integer> hashImpl = new HashTableImplementation2<String, Integer>();
        String message = "Paranoids are not\r\n" + "paranoid because they are paranoid but\r\n"
                + "because they keep putting themselves\r\n" + "deliberately into paranoid avoidable\r\n"
                + "situations";
        /*
         * Input data from the phrase
         */
        String message = "Paranoids are not\r\n" + "paranoid because they are paranoid but\r\n"
                + "because they keep putting themselves\r\n" + "deliberately into paranoid avoidable\r\n"
                + "situations";

        /*
         * Split the words when a white space comes up and Convert all the words in
         * lowercase
         */
        String[] messageArray = message.toLowerCase().split(" ");

        for (String word : messageArray) {
            /*
             * Split the words when a white space comes up and Convert all the words in
             * lowercase
             * Search for the word in the linked list
             */
            String[] messageArray = message.toLowerCase().split(" ");

            for (String word : messageArray) {
                /*
                 * Search for the word in the linked list
                 */
                Integer value = hashImpl.get(word);
                Integer value = hashImpl.get(word);
                /*
                 * If not found, frequency of the word StayWith 1
                 */
                if (value == null)
                    value = 1;
                else
                    /*
                     * If not found, frequency of the word StayWith 1
                     * If found, frequency of the word increases by 1
                     */
                    if (value == null)
                        value = 1;
                    else
                        /*
                         * If found, frequency of the word increases by 1
                         */
                        value = value + 1;
                hashImpl.add(word, value);
            }
            System.out.println(hashImpl);
            value = value + 1;
            hashImpl.add(word, value);
        }

        /*
         * Remove "avoidable" from the hashtable
         */
        hashImpl.remove("avoidable");

        /*
         * Display the hashtable
         */
        System.out.println(hashImpl);

    }
}
