public class longestPrefixTrie {


    static final int ALPHABET_sIZE = 26;

    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_sIZE];
        boolean isEndOfWord;

        public TrieNode() {
            isEndOfWord = false;
            for (int i=0; i< ALPHABET_sIZE; i++) {
                children[i] = null;
            }
        }
    }

    static TrieNode root;
    static int indexs;

    public static void insert(String key) {
        int length = key.length();
        int index;

        TrieNode pCrawl = root;

        for (int level=0; level< length; level++) {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null) {
                pCrawl.children[index] = new TrieNode();
            }
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }



    public static int countChildrens(TrieNode node) {
        int count = 0;
        for (int i=0; i<ALPHABET_sIZE; i++) {
            if (node.children[i] != null) {
                count++;
                indexs = i;
                System.out.println("loop index " + i);
            }
        }
        return count;
    }


    public static String walkTrie() {
        TrieNode pCrawl = root;
        indexs = 0;
        String prefix = "";
        System.out.println("index before" + indexs);
        while(countChildrens(pCrawl) == 1 && pCrawl.isEndOfWord == false) {
            System.out.println("index " + indexs);
            pCrawl = pCrawl.children[indexs];
            prefix = prefix + (char)('a' + indexs);
            System.out.println("pCrawl" + pCrawl + "prefix " + prefix);
        } 
        return prefix;
    }
    
    
    
    

    public static void constructTrie(String arr[], int n) {
        for (int i=0; i<n; i++) {
            insert(arr[i]);
        }
        return;
    }

    public static String commonPrefix(String arr[], int n) {
        root = new TrieNode();
        constructTrie(arr,n);

        return walkTrie();
    }



        public static void main(String[] args) {
            String arr[] = {"geeksforgeeks", "geeks",
                        "geek", "geezer"};
            int n = arr.length;
            String ans = commonPrefix(arr,n);

            if(ans.length() != 0) {
                System.out.println("The longest prefix is" + ans);
            }
            else {
                System.out.println("There is no longest prefix");
            }
        }    
}