package Com.BridgeLabz.HashTable2;

public class HashTableImplementation2<K, V> {
    Node2 head;
    Node2 tail;
    public void add(K key, V value) {


            public void append(Node2<K, V> myNode) {
                }
            }
            public Node2<K, V> searchNode(K data) {
                    return currentNode;
                }

                // Searching for the word and get the value from the linked list
                /**
                 *
                 * @param word- Searching for the word and get the value from the linked list
                 @@ -68,8 +69,32 @@ public V get(K word) {

                 }

                 /**
                  * Remove avoidable word from the phrase By using K word it will find the
                  * particular word from the hashtable and from remove method will it
                  *
                  * @param word- remove word
                 */
                public void remove(K word) {
                    Node2 currentNode = head;
                    Node2 previousNode = null;
                    while (currentNode != null && currentNode.getKey().equals(word)) {
                        head = currentNode.getNext();
                        return;
                    }
                    while (currentNode != null && !(currentNode.getKey().equals(word))) {
                        previousNode = currentNode;
                        currentNode = currentNode.getNext();
                    }
                    if (currentNode != null) {
                        previousNode.next = currentNode.next;
                    }
                    if (currentNode == null)
                        System.out.println("Word not found!");
                }

                /*
                 *  Print the linked list
                 * Print the linked list
                 */
                @Override
                public String toString() {
                    return "MyLinkedListNodes{" + head + "} ";
                }

            }
