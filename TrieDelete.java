import java.util.HashMap;
import java.util.Map;

public class TrieDelete {
	
    
    static class TrieNode {
        Map<Character, TrieNode> children;

        boolean isEndOfWord;

        TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
	
	}

    static TrieNode root;


    public TrieDelete() {
        root = new TrieNode();
    }


// iterative insert with Hashmap
    public void insert(String word) {
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



// recursive insert
    public void insertRecursive(String word) {
        insertRec(root, word, 0);
    }

    public insertRec(TrieNode current, String word, int index) {
        if (index == word.length()) {
            current.isEndOfWord = true;
            return;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);

        if (node == null) {
            node = new TrieNode();
            current.children.put(ch, node);
        }

        insertRec(node, word, index+1);
    }


// to search in Trie

    public boolean search(String word) {
        TrieNode current = root;
        for (int i=0; i<word.length; i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node ==  null) {
                return false;
            }
            current = node;
        }

        return current.isEndOfWord;
    }

    public boolean searchRecusive(String word) {
        return searchRec(current, word, 0);
    }


    // search recursively in Trie

    public boolean searchRec(TrieNode current, String word, int index) {
        if (index == word.length()) {
            return current.isEndOfWord;
        }

        Char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);

        if (node == null) {
            return false;
        }
        return searchRec(node, word, index+1);
    }



// Delete in Trie

    public void delete(String word) {
        deleteWord(root, word, 0);
    }

    public boolean deleteWord(TrieNode current, String word, int index) {
        if (index == word.length) {

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

}