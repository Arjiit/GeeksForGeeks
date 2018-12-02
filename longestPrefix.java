import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

// O(n) n - length of input string.


public class longestPrefix {

   static class TrieNode {
       Map<Character, TrieNode> children;
       boolean isEndOfWord;
       public TrieNode() {
           children = new HashMap<>();
           isEndOfWord = false;
       }
   }

   static TrieNode root;

   public static void insert(String word) {
       TrieNode current = root;
       for (int i=0; i<word.length(); i++) {
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

    public static void search(String word) {
        TrieNode current = root;
        int length = word.length();
        int prevMatch = 0;

        for(int i=0; i< length; i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);

            if (node == null) {
                break;
            }

            current = node;
            if(current.isEndOfWord) {
                prevMatch = i+1;
            }
        }
        System.out.println("Output: " + word.substring(0, prevMatch));
    }

    public static void main(String[] args) {
        root = new TrieNode();
        insert("are");
        insert("area");
        insert("base");
        insert("cat");
        insert("cater");
        insert("children");
        insert("basement");
        insert("aloha");

        search("caterer");
        search("basemexy");
        search("child");

    }

}
