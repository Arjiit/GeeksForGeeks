import java.util.HashMap;
import java.util.Map;

public class TrieDelete2 {
	
    
    static class TrieNode {
        Map<Character, TrieNode> children;

        boolean isEndOfWord;

        TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
	
	}

    static TrieNode root;


    public TrieDelete2() {
        root = new TrieNode();
    }
    
        public static void insert(String word) {
        TrieNode current = root;
        for (int i=0; i< word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.isEndOfWord = true;
    }
    
    public static boolean search(String word) {
        TrieNode current = root;
        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node ==  null) {
                return false;
            }
            current = node;
        }

        return current.isEndOfWord;
    }


// Delete in Trie

    public static void delete(String word) {
        deleteWord(root, word, 0);
    }

    public static boolean deleteWord(TrieNode current, String word, int index) {
        if (index == word.length()) {

            // when end of word is reached only delete if current.isEndOfWord is true.
            if (!current.isEndOfWord) {
                return false;
            }
            current.isEndOfWord = false;
        // if current has no other mapping then return true

            return current.children.size() == 0;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            return false;
        }

        boolean shouldDeleteCurrentNode = deleteWord(node, word, index+1);

        if (shouldDeleteCurrentNode) {
            current.children.remove(ch);
            return current.children.size() == 0;
        }
        return false;
    }
    
    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                         "by", "bye", "their"};
      
        String output[] = {"Not present in trie", "Present in trie"};
      
      
        root = new TrieNode();
      
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
        
         
        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);
         
        delete("the");
                if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
    }

}